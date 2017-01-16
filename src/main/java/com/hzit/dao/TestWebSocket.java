package com.hzit.dao;

import javax.websocket.*;
import javax.websocket.server.ServerEndpoint;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.CopyOnWriteArraySet;

/**
 * Created by Administrator on 2017/1/11.
 */
@ServerEndpoint("/getChat")
public class TestWebSocket {
    private static CopyOnWriteArraySet<TestWebSocket> copyOnWriteArraySet=new CopyOnWriteArraySet<>();
    private Session session;

    /**
     * 打开连接
     * @param session 需要传入一个session对象，这个session是webSocket包下的
     */
    @OnOpen
    public void open(Session session){
        this.session=session;
        copyOnWriteArraySet.add(this);
        System.out.println("通过"+session.getRequestURI()+"路径成功连接上服务器！");
    }

    /**
     * 关闭连接
     * @param session
     */
    @OnClose
    public void close(Session session){
        try {
            session.close();
            copyOnWriteArraySet.remove(this);
            System.out.println("客户端断开了连接！");
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }

    /**
     *  发送消息
     * @param session 传入session对象
     * @param message 传入消息对象，将该消息发送群发到其他客户端
     */
    @OnMessage
    public void send(Session session,String message){
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd hh:mm:dd");
        String time=simpleDateFormat.format(new Date());
        for(TestWebSocket testWebSocket : copyOnWriteArraySet){
            try {
                session.getBasicRemote().sendText("【"+time+"】的时候发送了<span style=\"color:red;font-size:15px;\">"+message+"！</span>");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    @OnError
    public void error(Session session,Throwable throwable){
            throwable.printStackTrace();
        try {
            session.close();
            System.out.println("链接异常，无法连接！");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
