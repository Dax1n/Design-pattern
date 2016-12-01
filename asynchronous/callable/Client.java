package com.asynchronous.callable;

/**
 * Created by 青春常驻Dax1n on 2016/12/1.
 *
 * 模拟CS结果的客户端
 *
 */
public class Client implements CSCallBack {

    private Server server;

    public Client(Server server) {
        this.server = server;
    }

    public void sendMsg(final String msg){
        System.out.println("客户端：发送的消息为：" + msg);
        /**
         * 新开启一个子线程去调用Server的getClientMsg方法，
         * 并把当前客户端实例发送给服务器，
         * 目的是服务器完成对客户端的回调。
         */
        new Thread(new Runnable() {
            @Override
            public void run() {
                server.getClientMsg(Client.this,msg);
            }
        }).start();
        System.out.println("客户端：异步发送成功");
    }

    @Override
    public void process(String status) {
        System.out.println("客户端：服务端回调状态为：" + status);
    }
}
