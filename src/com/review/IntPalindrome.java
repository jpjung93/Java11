package com.review;

public class IntPalindrome {
  public static void main(String[] args) {
    int a = 121;
    System.out.println(a + " is a palindrome: " + checkPalindrome(a));
    a = 2222;
    System.out.println(a + " is a palindrome: " + checkPalindrome(a));
    a = 1234;
    System.out.println(a + " is a palindrome: " + checkPalindrome(a));
    a = 5;
    System.out.println(a + " is a palindrome: " + checkPalindrome(a));


  }

  public static boolean checkPalindrome(int test){
    int original = test;
    int reversed = 0;
    while(test > 10){
      // multiply by 10 to accommodate for new digit
      reversed = reversed * 10;
      int add = test % 10;
      reversed+=add;
      test = test / 10;

    }
    reversed = reversed * 10;
    reversed += test;

    if(original < 10) return true;

    return original == reversed;
  }
}
