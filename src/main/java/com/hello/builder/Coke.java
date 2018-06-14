package com.hello.builder;

public class Coke extends ColdDrink{
  @Override
  public String name() {
    return "可乐加冰";
  }

  @Override
  public float price() {
    return 30.0f;
  }
  //可乐
}
