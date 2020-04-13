package com.chapters.chapter3;

import java.io.IOException;

public class Help {
  public static void main(String[] args) {
    // Display choices
    System.out.println("Help on :");
    System.out.println("  1. if");
    System.out.println("  2. switch");
    System.out.print("Choose one: ");

    // Read input
    try {
      char choice = (char) System.in.read();

      // switch on choice given
      switch(choice){
        case '1':
          // user selects if
          System.out.println("The if:\n");
          System.out.println("if(condition) statement;");
          System.out.println("else statement;");
          break;

        case '2':
          // user selects switch
          System.out.println("The switch:\n");
          System.out.println("switch(expression) {");
          System.out.println("  case constant:");
          System.out.println("    statement sequence");
          System.out.println("    break;");
          System.out.println("  // ...");
          System.out.println("}");
          break;

        default:
          System.out.println("Selection not found");
      }
    } catch (IOException e) {
      e.printStackTrace();
    }

  }
}
