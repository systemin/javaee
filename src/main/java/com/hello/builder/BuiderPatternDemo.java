package com.hello.builder;

public class BuiderPatternDemo {
  public static void main(String[] args) {
    MealBuilder mealBuilder = new MealBuilder();

    Meal meal = mealBuilder.prepareVegMeal();

    System.out.println("1");
    meal.showItems();
    System.out.println("2: " +meal.getCost());

    Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
    System.out.println("\n\nMeal");
    nonVegMeal.showItems();
    System.out.println("Total Cost:1 " +nonVegMeal.getCost());
  }
}
