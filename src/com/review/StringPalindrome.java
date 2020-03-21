package com.review;

public class StringPalindrome {
  public static void main(String[] args) {
    String a = "Bob";
    System.out.println("\"" + a + "\" is a palindrome: " + checkStrPalindrome(a));

    a = "race     car";
    System.out.println("\"" + a + "\" is a palindrome: " + checkStrPalindrome(a));

  }

  public static boolean checkStrPalindrome(String check){
    // Check each character at the start and end to see if they match
    char[] charCheck = check.toUpperCase().toCharArray();

    int end = charCheck.length-1;
    // check match, increment start index and decrement end index
    for(int start = 0; start < end; start++, end--){
      if(charCheck[start] != charCheck[end]) return false;
    }

    return true;
  }
}
