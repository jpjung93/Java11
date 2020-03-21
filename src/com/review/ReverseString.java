package com.review;

public class ReverseString {
  public static void main(String[] args) {
    String a = "Jeff";
    System.out.println("\"" + a + "\" reversed is: \"" + reverse(a) + "\"");


    char[] temp = {'h', 'e', 'l', 'l', 'o'};
    System.out.println(temp.toString());
    System.out.println(new String(temp));
  }

  public static String reverse(String str){
    char[] rev = new char[str.length()];
    int revIndex = 0;
    for(int strIndex = str.length() -1; strIndex >= 0; strIndex--, revIndex++){
      rev[revIndex] = str.charAt(strIndex);
    }

    return new String(rev);
  }
}
