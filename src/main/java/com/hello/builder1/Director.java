package com.hello.builder1;

public class Director {

  //组装 、建造
  public void Construc( Builder builder){

    builder.BuildCPU();

    builder.BuildHD();

    builder.BuildMainboard();
  }
}
