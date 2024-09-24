package com.leo.websocketdemo.websocket;


/**
 * 用来封装服务端给浏览器发送的消息数据
 */

public class ResultMessage {

    private boolean isSystem;
    private String fromName;
    private Object message;// 如果是系统消息是数组

    public ResultMessage() {

    }

    public ResultMessage(boolean isSystem, String fromName, Object message) {
        this.isSystem = isSystem;
        this.fromName = fromName;
        this.message = message;
    }

    public boolean isSystem() {
        return isSystem;
    }

    public void setSystem(boolean system) {
        isSystem = system;
    }

    public String getFromName() {
        return fromName;
    }

    public void setFromName(String fromName) {
        this.fromName = fromName;
    }

    public Object getMessage() {
        return message;
    }

    public void setMessage(Object message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "ResultMessage{" +
                "isSystem=" + isSystem +
                ", fromName='" + fromName + '\'' +
                ", message=" + message +
                '}';
    }

}
