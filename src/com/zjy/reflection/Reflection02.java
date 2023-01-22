package com.zjy.reflection;

import com.zjy.Cat;

import java.lang.reflect.Method;

public class Reflection02 {
    public static void main(String[] args) throws Exception {
        m1();
        m2();

    }

        public static void m1() {
            Cat cat = new Cat();
            for (int i = 0; i<90000000;i++){
                cat.hi();

        }

    }

    public static void m2() throws Exception {
        //加载类，返回class类型的对象
        Class cls = Class.forName("com.zjy.Cat");
        //创建Cat类的实例对象
        Object o = cls.newInstance();
        //创建Method类的对象
        Method hi = cls.getMethod("hi");
        for (int i = 0; i < 9000000; i++) {
            //反射机制调用的方法
            hi.invoke(o);

        }

    }
}
