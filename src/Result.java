/*Ananymous     class
abstract
interface
if you donot know the definitation / behavior then we will create abstract method

concrite method : If we defination


Object arr[]=new

java 1.7 version
implectile public
 */


import java.awt.*;

abstract class First{
    abstract public void method();

}

//class second extends First{
//
//    @Override
//    public void method() {
//        System.out.println("Welcome");
//
//    }
//}

interface i1{
    void m1();
    default public void m5(){

    }
//    public void m2();
//    abstract void m3();

    //public abstract
    public static final int b=10;  //public ststic wide method

}

public class Result {
    default public void m6(){

    }

    public static void main(String[] args) {
//        second Obj1 = new second();
//        Obj1.method();

//        First obj1=new First() {
//            @Override
//            public void method() {
//
//            }
//        } ;

        i1 obj=new i1() {
            @Override
            public void m1() {
                System.out.println("Hello Java");
            }
        };
    obj.m1();
    }
}