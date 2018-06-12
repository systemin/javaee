package com.hello.pattern;

public class AbstractFactoryPatternDemo {
  public static void main(String[] args) {
    AbstractFactory abstractFactory = FactoryProducer.getFactory("AbstractFactoryPattern");
    AbstractFactoryPattern factoryPattern=abstractFactory.getAbstractFactoryPattern("BusinessSuit");
    factoryPattern.suit();

    AbstractFactoryPattern factoryPattern1=abstractFactory.getAbstractFactoryPattern("MaoSuit");
    factoryPattern1.suit();

    AbstractFactoryPattern factoryPattern2=abstractFactory.getAbstractFactoryPattern("Sportswear");
    factoryPattern2.suit();

    AbstractFactory colorfactory=FactoryProducer.getFactory("Color");
    Color color=colorfactory.getColor("Red");
    color.fill();

    Color color1=colorfactory.getColor("Green");
    color1.fill();

    Color color2=colorfactory.getColor("Blue");
    color2.fill();

//    AbstractFactoryPattern factoryPattern3=abstractFactory.getAbstractFactoryPattern("0231");
//    factoryPattern3.suit();
  }
}
