package com.hello.singleton;

public class SingleObject {
  /**
   * 单例模式，只能有一个实例
   */
  private static SingleObject singleObject=new SingleObject();

  //私有的构造函数,类不会被实例化
  private SingleObject(){}

  public static SingleObject getSingleObject(){
    return singleObject;
  }

  public void showmessage(){
    System.out.println("hello word i 'im is Single");
  }
}
