package com.leo.websocketdemo.utils;

import com.alibaba.fastjson2.JSON;
import com.leo.websocketdemo.websocket.pojo.ResultMessage;



/**
 * @author leijiong
 * @version 1.0
 */
public class MessageUtils {
    public static String getMessage(boolean isSystemMessage, String fromName, Object message) {
        ResultMessage resultMessage = new ResultMessage();

        resultMessage.setSystem(isSystemMessage);
        resultMessage.setMessage(message);
        if (fromName != null) {
            resultMessage.setFromName(fromName);
        }

        return JSON.toJSONString(resultMessage);
    }

}
