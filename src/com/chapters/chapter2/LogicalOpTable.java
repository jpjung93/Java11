package com.chapters.chapter2;

public class LogicalOpTable {
  public static void main(String[] args) {
    boolean p = true, q = true;

    System.out.println("P\tQ\tAND\tOR\tXOR\tNOT");


    System.out.print(p + "\t" + q + "\t");
    System.out.print((p&q) + "\t" + (p|q) + "\t");
    System.out.println((p^q) + "\t" + (!p) + "\t");

    p = true; q = false;
    System.out.print(p + "\t" + q + "\t");
    System.out.print((p&q) + "\t" + (p|q) + "\t");
    System.out.println((p^q) + "\t" + (!p) + "\t");

    p = false; q = true;
    System.out.print(p + "\t" + q + "\t");
    System.out.print((p&q) + "\t" + (p|q) + "\t");
    System.out.println((p^q) + "\t" + (!p) + "\t");

    p = false; q = false;
    System.out.print(p + "\t" + q + "\t");
    System.out.print((p&q) + "\t" + (p|q) + "\t");
    System.out.println((p^q) + "\t" + (!p) + "\t");
  }
}
