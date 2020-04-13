package com.chapters.chapter2;

public class Hypot {
  public static void main(String[] args) {
    double x, y, z;

    x = 3;
    y = 4;

    z = Math.sqrt(x*x + y*y);

    System.out.println(x);
    System.out.println(y);
    System.out.println(z);

    System.out.println("Hypotenuse is " + z);
  }
}
