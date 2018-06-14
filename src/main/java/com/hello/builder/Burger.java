package com.hello.builder;

public abstract class Burger implements Item{
  //汉堡
    @Override
  public Packing packing(){
      return new Wrapper();
    }

  @Override
  public abstract float price();

}
