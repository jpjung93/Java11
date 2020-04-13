package com.chapters.chapter3;

public class Power {
  public static void main(String[] args) {
    int e;
    int result;

    for(int i = 0; i <= 10; i++){
      result = 1;
      e = i;

      while(e > 0){
        result *= 2;
        e--;
        // end while loop
      }

      System.out.println("2 to the power of " + i + " is " + result);
      // end for loop
    }
  }
}
