package com.review;
/*
  Simple Fibonacci program
 */


public class Fib {
  public static void main(String[] args) {
    fibLoop(1);
    fibLoop(2);
    fibLoop(3);
    fibLoop(4);
    fibLoop(10);
    fibLoop(-15);
    fibLoop(15);

  }

  // First using a loop
  public static void fibLoop(int num){
    if(num < 1){
      System.out.println("Please enter a number greater than 0");
      return;
    }
    int prev2 = 1; // Store value from 2 spaces back
    int prev = 1; // Store value from 1 space back

    // print at least the first in sequence
    System.out.print(prev2);

    if(num == 1){
      // return if only printing first in sequence
      System.out.println();
      return;
    }

    // Print next in sequence
    System.out.print(" " + prev);

    if(num == 2){
      // return if only printing second in sequence
      System.out.println();
      return;
    }

    int current; // use to be able to save previous numbers
    for(int i = 1; i < num; i++){
      current = prev2 + prev; // get the sum of past 2 numbers
      System.out.print(" " + current);

      // update previous counters
      prev2 = prev;
      prev = current;
    }

    // print new line upon completion
    System.out.println();
  }
}
