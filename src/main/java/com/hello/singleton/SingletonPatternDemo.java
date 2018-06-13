package com.hello.singleton;

public class SingletonPatternDemo {
  public static void main(String[] args) {
    //私有构造函数不可见，不能new

    //获取可用对象
    SingleObject object=SingleObject.getSingleObject();
    object.showmessage();
    //懒汉式线程安全
  LazySingleton lazySingleton=LazySingleton.getLazySingleton();
  lazySingleton.showmessage();

  //饿汉式线程安全
  HungrySingleton hungrySingleton=HungrySingleton.getHungrySingleton();
  hungrySingleton.message();
  }
}
