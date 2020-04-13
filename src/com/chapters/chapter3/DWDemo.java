package com.chapters.chapter3;

public class DWDemo {
  public static void main(String[] args) throws java.io.IOException{
    char ch;

    do{
      System.out.print("Press a Key followed by ENTER: ");
      ch = (char) System.in.read();
    }while(ch != 'q');

  }
}
