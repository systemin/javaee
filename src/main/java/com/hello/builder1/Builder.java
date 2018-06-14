package com.hello.builder1;

public abstract class Builder {
  //CPU
  public abstract void BuildCPU();

  //主板
  public abstract void BuildMainboard();

//硬盘
  public abstract void BuildHD();

  //返回产品方法
  public abstract  Computer getComputer();

}
