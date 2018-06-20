package com.hello.constructor;

public class TestCar {
  /*
 ,构造方法的方法名必须与类名一样。
 ,构造方法没有返回类型，也不能定义为void，在方法名前面不声明方法类型。
 ,构造方法不能作用是完成对象的初始化工作，他能够把定义对象时的参数传递给对象的域。
 ,构造方法不能由编程人员调用，而要系统调用。
 ,构造方法可以重载，以参数的个数，类型，或排序顺序区分。
   */
  public static void main(String[] args) {
    Car car = new Car();

    System.out.println();
  }

}
