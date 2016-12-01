package com.asynchronous.callable;

/**
 * Created by 青春常驻Dax1n on 2016/12/1.
 *  测试main方法
 *
 *  必看说明：
 *          1、什么是回调？
 *              回调：如果A的a1方法调用B的b1方法（我个人称之为：主调过程），在B的b1逻辑运行完毕需要给A一个状态的话，B在调用A的过程
 *                    这就是回调过程。
 *          2：同步回调和异步回调？
 *              同步回调：就是A的a1方法调用B的b1的方法开始，A开始进入阻塞状态，一直等待B的回调结果
 *              异步回调：就是A在a1方法中新开启一个线程去调用B的b1的方法，A不用阻塞等待B的结果，A起完新线程之后A就是开始继续
 *              做A的事情了，对于B的b1方法在子线程中调用。当B处理完b1的逻辑之后回调A的方法传递回结果
 *            所以：同步回调和异步回调主要区别就是在主线程还是在子线程中去调用B，在主线程就是同步回调，子线程就是异步回调
 *
 *
 *
 */
public class CallBackMain {
    public static void main(String[] args) {
        Server server = new Server();
        Client client = new Client(server);

        client.sendMsg("Server,Hello~");
    }
}