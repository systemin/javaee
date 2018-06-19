package com.hello.prototype;

public class PrototypePatternDemo {

  public static void main(String[] args) {
    ShapeCache.loadCached();

    Shape clonedShape = (Shape) ShapeCache.getShape("1");
    System.out.println("Shape : " + clonedShape.getType());
    clonedShape.ardw();
    Shape clonedShape1 = (Shape) ShapeCache.getShape("2");
    System.out.println("Shape : " + clonedShape1.getType());
    clonedShape1.ardw();
    Shape clonedShape2 = (Shape) ShapeCache.getShape("3");
    System.out.println("Shape : " + clonedShape2.getType());
    clonedShape2.ardw();
  }
}
