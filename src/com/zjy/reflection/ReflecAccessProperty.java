package com.zjy.reflection;

import java.lang.reflect.Field;

public class ReflecAccessProperty {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchFieldException {

        Class<?> stuClass = Class.forName("com.zjy.reflection.Student");
        Object o = stuClass.newInstance();
        Field age = stuClass.getField("age");
        age.set(o,88);
        System.out.println(o);
        Field name = stuClass.getDeclaredField("name");
        name.setAccessible(true);
        //name.set(o,"zjy");//也可以
        name.set(null,"zjy");//因为name是static属性，因此o也可以是null,静态属性在加载时就分配好了
        System.out.println(o);
        System.out.println(name.get(null));


    }
}
class Student{
    public int age;
    private static String name;

    public Student(){

    }

    @Override
    public String toString() {
        return "Student [age=" +age + ",name=" + name + "]";

    }
}