package com.review;
import java.lang.Math;

/*
  Check if a number is prime
    Only check up until the square root of the number
 */

public class CheckPrime {
  public static void main(String[] args) {
    System.out.println(checkPrime(12));
    System.out.println(checkPrime(13));
    System.out.println();

    for(int i = 1; i <= 20; i++){
      System.out.println("Is " + i + " prime?: " + checkPrime(i));
    }

  }

  public static boolean checkPrime(int num){
    // check up to square root because the complement would have already been found
    int root = (int) Math.sqrt(num);

    // check all numbers starting at 2
    for(int test = 2; test < root; test++){
      // return true if modulo is 0

      int mod = num % test;
      if(mod == 0) return false;
    }

    return true;
  }
}