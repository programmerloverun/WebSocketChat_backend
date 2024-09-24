package com.leo.websocketdemo.config;

import javax.servlet.http.HttpSession;
import javax.websocket.HandshakeResponse;
import javax.websocket.server.HandshakeRequest;
import javax.websocket.server.ServerEndpointConfig;

/**
 * 用于获取HttpSession
 */
public class GetHttpSessionConfig extends ServerEndpointConfig.Configurator {

    @Override
    public void modifyHandshake(ServerEndpointConfig serverEndpointConfig, HandshakeRequest request, HandshakeResponse response) {
        HttpSession httpSession = (HttpSession) request.getHttpSession();

        // 将 httpSession 对象存到 ServerEndpointConfig 对象中
        serverEndpointConfig.getUserProperties().put(HttpSession.class.getName(), httpSession);
    }

}