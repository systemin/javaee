package com.hello.pattern;

public class ShapeFactory {
  //工厂类
  public FactoryPattern getFactoryPattern(String Factorytype){
    if (Factorytype == null) {
      return null;
    }
    if (Factorytype.equalsIgnoreCase("FactoryPatternImpl")) {
      return new FactoryPatternImpl();
  }

    if (Factorytype.equalsIgnoreCase("FactoryPatternImpl1")) {
      return new FactoryPatternImpl1();
    }

    if (Factorytype.equalsIgnoreCase("FactoryPatternImpl2")) {
      return new FactoryPatternImpl2();
    }
    return null;
  }
}
