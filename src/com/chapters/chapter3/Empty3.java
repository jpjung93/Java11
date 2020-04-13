package com.chapters.chapter3;

public class Empty3 {
  public static void main(String[] args) {
    int i=1;
    int sum = 0;

    sum += i++;

    //for(i = 1; i <= 5; sum += i++);

    System.out.println(sum);
    System.out.println(i);
  }
}
