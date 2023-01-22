package com.zjy.reflection;

import org.junit.jupiter.api.Test;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionUtils {
    public static void main(String[] args) {

    }
    @Test
    public void api_01() throws ClassNotFoundException {

        Class<?> personCls = Class.forName("com.zjy.reflection.Person");
//        1.getName:获取全类名
        System.out.println(personCls.getName());
//        2. getSimpleName:获取简单类名
        System.out.println(personCls.getSimpleName());
//        3. getFields:获取所有public修饰的属性,包含本类以及父类的
        Field[] fields = personCls.getFields();
        for (Field field : fields) {
            System.out.println(field.getName());

        }
//        4. getDeclaredFields:获取本类中所有属性
        Field[] declaredFields = personCls.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField.getName());
        }

//        5. getMethods:获取所有public修饰的方法，包含本类以及父类的
        Method[] methods = personCls.getMethods();
        for (Method method : methods) {
            System.out.println(method.getName());
        }


//        6. getDeclaredMethods:获取本类中所有方法

        Method[] declaredMethods = personCls.getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            System.out.println(declaredMethod.getName());
        }
//        7. getConstructors:获取所有public修饰的构造器，包含本类

        Constructor<?>[] constructors = personCls.getConstructors();
        for (Constructor<?> constructor : constructors) {
            System.out.println(constructor.getName());
        }
//        8. getDeclaredConstructors:获取本类中所有构造器

        Constructor<?>[] declaredConstructors = personCls.getDeclaredConstructors();
        for (Constructor<?> declaredConstructor : declaredConstructors) {
            System.out.println(declaredConstructor.getName());
        }
//        9. getPackage:以Package形式返回包信息
        System.out.println(personCls.getPackage());
//        10.getSuperClass:以Class形式返回父类信息
        System.out.println(personCls.getSuperclass());
//        11.getInterfaces:以Class[形式返回接口信息
        Class<?>[] interfaces = personCls.getInterfaces();
        for (Class<?> anInterface : interfaces) {
            System.out.println(anInterface);
        }
//        12.getAnnotations:以Annotation[形式返回注解信息
        Annotation[] annotations = personCls.getAnnotations();
        for (Annotation annotation : annotations) {
            System.out.println(annotation);
        }
//
    }
}
interface IA{

}
class A implements IA{
    public String hobby;

    public void hi(){

    }

    public A(){

    }
}
@Deprecated
class Person extends A{
    public String name;
    protected int age;
    String job;
    private double sal;

    public Person(){}

    public Person(String name){

    }

    private Person(String name,int age){

    }

    public void m1(){

    }

    protected void m2(){

    }

    void m3(){

    }

    private void m4(){

    }
}