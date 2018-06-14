package com.hello.builder;

public class ChickenBurger extends Burger{
  @Override
  public String name() {
    return "汉堡包";
  }

  @Override
  public float price() {
    return 50.0f;
  }
}
