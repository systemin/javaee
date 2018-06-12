package com.hello.pattern;

public class FactoryProducer {
  public static AbstractFactory getFactory(String choice){
    if (choice == null) {

      return null;
    }
    if (choice.equalsIgnoreCase("AbstractFactoryPattern")) {

      return new SuitFactory();
    }
    else if (choice.equalsIgnoreCase("Color")){

      return new ColorFactory();
    }
    return null;
  }
}
