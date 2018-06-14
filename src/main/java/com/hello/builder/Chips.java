package com.hello.builder;

public abstract class Chips implements Item {
  //薯条
  @Override
  public Packing packing() {
    return new Canning();
  }

  @Override
  public abstract float price();
}
