package com.zjy.reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflecAccessMethod {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {

        Class<?> aClass = Class.forName("com.zjy.reflection.Boss");
        Object o = aClass.newInstance();
        Method hi = aClass.getMethod("hi",String.class);

        hi.invoke(o,"zjy");

        Method say = aClass.getDeclaredMethod("say", int.class,String.class, char.class);
        say.setAccessible(true);
        System.out.println(say.invoke(o,100,"zhangsan",'男'));

        //因为say是静态方法，所以可以这样调用
        System.out.println(say.invoke(null,100,"zz",'n'));

    }
}
class Boss {
    public int age;
    private static String name;

    public Boss() {
    }

    private static String say(int n, String s, char c) {
        return n + "" + s + "" + c;
    }

    public void hi(String s) {
        System.out.println("hi " + s);
    }
}
