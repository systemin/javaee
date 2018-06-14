package com.hello.builder1;

import java.util.ArrayList;
import java.util.List;

public class Computer {
  private List<String> list = new ArrayList<String>();

  public void add(String part){
    list.add(part);
  }

  public void show(){
    for (int i = 0; i < list.size(); i++) {
      System.out.println("组件"+list.get(i)+"组装好了");
    }
    System.out.println("电脑组装好了，请验收！");
  }
}
