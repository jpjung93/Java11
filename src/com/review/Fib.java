package com.review;
/*
  Simple Fibonacci program

  Loop works better-ish
  Tried recursion, but not too great, need to print first number
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

    System.out.println("\nRecursively... \n");

    fibRec(1);
    fibRec(2);
    fibRec(3);
    fibRec(4);
    fibRec(10);
    fibRec(-15);
    fibRec(15);

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

  public static void fibRec(int count){
    if(count < 0){
      System.out.println("Please enter a number greater than 0");
      return;
    }

    fibRecHelp(count, 0, 1);
    System.out.println();
  }

  public static void fibRecHelp(int count, int prev2, int prev1){
    if(count == 0){
      return;
    }

    int current = prev2 + prev1;
    System.out.print(current + " ");

     fibRecHelp(--count, prev1, current);

  }
}
