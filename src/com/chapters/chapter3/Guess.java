package com.chapters.chapter3;

public class Guess {
  public static void main(String[] args) throws java.io.IOException{
    char c, answer = 'K';

    System.out.println("I'm thinking of a letter between A and Z.");
    System.out.print("Can you guess what it is?: ");

    c = (char) System.in.read();

    if(c == answer){
      System.out.println("** RIGHT **");
    }
  }
}
