package com.hello.singleton;

public class HungrySingleton {
  //饿汉式线程安全
  private static HungrySingleton hungrySingleton=new HungrySingleton();

  private HungrySingleton(){}

  public static HungrySingleton getHungrySingleton(){
    return hungrySingleton;
  }
  public void message(){
    System.out.println("我是饿汉式线程安全的");
  }
}
