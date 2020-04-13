package com.chapters.chapter2;

/*
  Compute how far away you are from lightning

  Sound travels 1,100 feet per second
 */

public class Sound {
  public static void main(String[] args) {
    double seconds = 7.2;
    int fps = 1100;

    System.out.println("If it takes " + seconds + " seconds to hear lightning"+
      ", then it is " + (seconds * fps) + " ft away");
  }
}
