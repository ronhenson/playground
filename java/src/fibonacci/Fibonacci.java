package src.fibonacci;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
Author: ron henson
Creation date: 2021-03-10
*/

public class Fibonacci {

  public static void main(String[] args) {

    int inputNumber;

    Scanner scan = new Scanner (System.in);

    while (true) {
      System.out.print("Enter Integer: ");
      try {
        inputNumber = scan.nextInt();
        break;
      } catch ( InputMismatchException e) {
        System.out.println("Invalid, Must be an Intger, Re-enter");
        scan.nextLine();
      }
    }
    scan.close();

    System.out.println("Is '" + inputNumber + "' a Fibonacci number: " + isFibonacci(inputNumber) );
  }

  public static boolean isFibonacci(int inputNumber ) {

    int f1 = 0;
    int f2 = 1;

    if ( inputNumber == f1 || inputNumber == f2) return true;

    int fibonacciNumber = 1;

    while(fibonacciNumber <= inputNumber) {
      if (fibonacciNumber == inputNumber) return true;
      f1 = f2;
      f2 = fibonacciNumber;
      fibonacciNumber = f1 + f2;
    }
    return false;

  }
}
