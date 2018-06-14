package com.hello.builder;

import java.util.ArrayList;
import java.util.List;

public class Meal {
  private List<Item> items=new ArrayList<Item>();

  public void additem(Item item){
    items.add(item);
  }
  public float getCost(){
    float cost=0.0f;
    for (Item item:items) {
      cost += item.price();
    }
    return cost;
  }

  public void showItems(){
    float cont=0.0f;
    for (Item item:items) {
      System.out.println("名字："+item.name());
      System.out.print(", 包装 : "+item.packing().pack());
      System.out.println(", 价格 : "+item.price());
    }
  }

}
