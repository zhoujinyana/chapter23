package com.zjy.reflection.classload;

public class ClassLoad {
    public static void main(String[] args) {
        //1．加载B类，并生成B的class对象
        // 2．链接num = 0
        //3．初始化阶段
        //依次自动收集类中的所有静态变量的赋值动作和静态代码块中的语句,并合并
                //clinit(O{
                //System.out.println("B 静态代码块被执行");
                // num = 300;
                //num = 100;
                //}
                //合并:num = 100

        //new B();
        System.out.println(B.num );

    }
}
class B{
    static {
        System.out.println("B的静态代码块");
        num = 300;
    }
    static int num = 100;
    public B(){//现在不会执行，new B()【new对象才会执行]
        System.out.println("b的构造器被执行");
    }
}