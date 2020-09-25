package com.dzkj.a3dmap.utils;

/**
 * 网络工具类
 */
public class NetUtils {
    //静态内部类单例模式
    private NetUtils(){
        initOkHttp();
    }
    private static class SingleInstance{
        private static final NetUtils INSTANCE=new NetUtils();
    }

    public static NetUtils getInstance() {
        return SingleInstance.INSTANCE;
    }

    private void initOkHttp() {

    }
}
