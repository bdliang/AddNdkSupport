package com.bdliang.mylib;

/**
 * Created by bdliang on 17-12-12.
 */

public class MyLib {
    static {
        //加载so 文件
        System.loadLibrary("math");
    }


    public native int add(int para1, int para2);

}
