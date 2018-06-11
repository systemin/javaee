package com.hello.pattern;

public class FactoryPatternDemo {
  public static void main(String[] args) {
    ShapeFactory shapeFactory = new ShapeFactory();
    FactoryPattern factoryPattern = shapeFactory.getFactoryPattern("FactoryPatternImpl");
    factoryPattern.draw();

    FactoryPattern factoryPattern1 = shapeFactory.getFactoryPattern("FactoryPatternImpl1");
    factoryPattern1.draw();

    FactoryPattern factoryPattern2 = shapeFactory.getFactoryPattern("FactoryPatternImpl2");
    factoryPattern2.draw();
  }
}
