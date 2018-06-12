package com.hello.pattern;

public class ColorFactory extends AbstractFactory{

  public AbstractFactoryPattern getAbstractFactoryPattern(String abstractFactoryPattern) {
    return null;
  }

  public Color getColor(String color) {
    if (color == null) {

      return null;
    }
    if (color.equalsIgnoreCase("Red")) {

      return new  Red();
    }
    if (color.equalsIgnoreCase("Green")) {

      return new Green();
    }
    if (color.equalsIgnoreCase("Blue")) {

      return new Blue();
    }
    else {
      System.out.println("未知错误！！！");
    }
    return null;
  }
}
