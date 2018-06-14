package com.hello.builder;

public abstract class ColdDrink implements Item{
//冷饮
  @Override
  public Packing packing() {
    return new Bottle();
  }

  @Override
  public abstract float price();

}
