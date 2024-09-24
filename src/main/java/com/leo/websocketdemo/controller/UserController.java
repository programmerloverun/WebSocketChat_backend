package com.leo.websocketdemo.controller;

import com.leo.websocketdemo.pojo.model.User;
import com.leo.websocketdemo.pojo.vo.Result;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

/**
 * @author leijiong
 * @version 1.0
 */
@RestController
@RequestMapping("/user")
public class UserController {
    /**
     * 登录
     *
     * @param user        提交的用户数据，包含用户名和密码
     * @param httpSession HttpSession
     * @return Result<Object>
     */
    @PostMapping("/login")
    public Result<Object> login(@RequestBody User user, HttpSession httpSession) {
        if (user == null || !"123456".equals(user.getPassword())) {
            return Result.fail("用户名或密码错误");
        }

        httpSession.setAttribute("currentUser", user.getUsername());
        return Result.success();
    }

    /**
     * 获取用户名
     *
     * @param httpSession HttpSession
     * @return String
     */
    @GetMapping("/getUsername")
    public Result<String> getUsername(HttpSession httpSession) {
        return Result.success((String) httpSession.getAttribute("currentUser"));
    }

}
