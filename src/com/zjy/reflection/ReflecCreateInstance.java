package com.zjy.reflection;

//通过反射机制创建对象

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflecCreateInstance {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {


        //1．先获取到User类的Class对象

        Class<?> userClass = Class.forName("com.zjy.reflection.User");

        //2．通过public的无参构造器创建实例

        Object o = userClass.newInstance();
        System.out.println(o);

        //3．通过public的有参构造器创建实例
        //String name这个构造器
        Constructor<?> constructor = userClass.getConstructor(String.class);
        Object jack = constructor.newInstance("jack");
        System.out.println(jack);

        //4，通过非public的有参构造器创建实例



        Constructor<?> constructor1 = userClass.getDeclaredConstructor(int.class, String.class);
        //使用反射可以访问private的构造器（暴破）
        constructor1.setAccessible(true);
        Object lily = constructor1.newInstance(12, "lily");
        System.out.println(lily);


    }
}
class User {
    private int age = 10;
    private String name = "zjy";

    public User(){}

    public User(String name){
        this.name = name;
    }

    private User(int age,String name){
        this.age = age;
        this.name = name;
    }

    public String toString(){
        return "User [age = " + age +", name=" + name + "]"; }};

