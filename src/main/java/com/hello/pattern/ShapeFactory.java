package com.hello.pattern;

public class ShapeFactory {
  //工厂类

  /**
   * 多方法工厂（常用）
   * @param Factorytype
   * @return
   */

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

  /**
   * 静态工厂
   */
  public static final int FP_IMPL = 0;
  public static final int FP_IMPL1 = 1;
  public static final int FP_IMPL2 = 2;
    public  FactoryPattern Patterns(int type){
      switch (type){
        case FP_IMPL:
         return new FactoryPatternImpl();
        case FP_IMPL1:
         return new FactoryPatternImpl1();
        case FP_IMPL2:
         return new FactoryPatternImpl2();
      }
      return null;
    }
}
