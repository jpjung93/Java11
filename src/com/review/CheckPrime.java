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

    for(int i = 1; i <= 50; i++){
      //System.out.println("Is " + i + " prime?: " + checkPrime(i));
      if(checkPrime(i)){
        System.out.println(i);
      }
    }

    System.out.println((-10) + " is a prime number: " + checkPrime(-10));

  }

  public static boolean checkPrime(int num){
    // 0, 1, 2, and negative numbers are not prime by definition
    if(num <= 2){
      return false;
    }

    // check up to square root because the complement would have already been found
    int root = (int) Math.sqrt(num);

    // check all numbers starting at 2
    for(int test = 2; test <= root; test++){
      // return true if modulo is 0

      int mod = num % test;
      if(mod == 0) return false;
    }

    return true;
  }
}
