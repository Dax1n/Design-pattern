package com.asynchronous.callable;

/**
 * Created by 青春常驻Dax1n on 2016/12/1.
 * CS中的异步回调
 * 比如这里模拟个场景：客户端发送msg给服务端，服务端处理后（5秒），回调给客户端，告知处理成功。代码如下:
 *
 *
 *
 */
public interface CSCallBack {
    public void process(String status);
}
