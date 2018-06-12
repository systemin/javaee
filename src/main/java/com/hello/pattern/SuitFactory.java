package com.hello.pattern;

public class SuitFactory extends AbstractFactory {
  public AbstractFactoryPattern getAbstractFactoryPattern(String FactoryType) {
    if (FactoryType == null) {

      return null;
    }
    if (FactoryType.equalsIgnoreCase("BusinessSuit")) {

      return new BusinessSuit();
    }
    if (FactoryType.equalsIgnoreCase("MaoSuit")) {

      return new MaoSuit();
    }
    if (FactoryType.equalsIgnoreCase("Sportswear")) {

      return new Sportswear();
    }
    else {

      System.out.println(new Exception("空指针异常！"));

    }
    return null;
  }

  public Color getColor(String color) {
    return null;
  }
}
