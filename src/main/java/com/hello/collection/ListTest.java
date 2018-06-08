package com.hello.collection;
import java.util.ArrayList;
import java.util.List;

public class ListTest {
  public static void main(String[] args) {
    List list=new ArrayList();
    list.add("么么哒");
    list.add("嘤嘤嘤");
    list.add("叽叽叽");
    System.out.println(list);
    list.add(1,"嘤嘤嘤");
    for (int i = 0; i < list.size(); i++) {
      System.out.println(list.get(i));
    }
    list.remove(1);
    System.out.println(list);
  }
}
