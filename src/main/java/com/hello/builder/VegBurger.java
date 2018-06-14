package com.hello.builder;

public class VegBurger extends Burger {
  @Override
  public String name() {
    return "汉堡";
  }

  @Override
  public float price() {
    return 25.0f;
  }
}
