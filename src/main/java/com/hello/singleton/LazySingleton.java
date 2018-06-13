package com.hello.singleton;

public class LazySingleton {
  private static LazySingleton lazySingleton;

  private LazySingleton(){}

  public static synchronized LazySingleton getLazySingleton(){
    if (lazySingleton == null) {
     lazySingleton = new LazySingleton();
    }
    return lazySingleton;
  }
  public void showmessage(){
    System.out.println("我是懒汉式线程安全的");
  }
}
