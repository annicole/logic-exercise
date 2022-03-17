/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interview;

import java.util.Scanner;

/**
 *
 * @author ANA.ROSAS
 */
public class DecimalToBinary {

  public static void main(String[] args) {
    System.out.println("Enter the decimal number");
    int inputNumber = new Scanner(System.in).nextInt();
    System.out.println("The equivalent of " + inputNumber + " is : " + toBinary(inputNumber));
    System.out.println("The equivalent of " + inputNumber + " is : " + toDecimal(inputNumber));
    System.out.println("The equivalent of " + inputNumber + " is : " + toHexadecimal(inputNumber));
  }

  public static String toBinary(int inputNum) {
    int rem = 0, num = inputNum;
    String binary = "";
    while (num > 0) {
      rem = num % 2;
      binary = rem + binary;
      num = num / 2;
    }
    return binary;
  }

  public static String toDecimal(int inputNum) {
    int rem = 0, num = inputNum;
    String octal = "";
    while (num > 0) {
      rem = num % 8;
      octal = rem + octal;
      num = num / 8;
    }
    return octal;
  }

  public static String toHexadecimal(int inputNum) {
    int rem = 0, num = inputNum;
    String hexadecimal = "";
    char hexDeciamls[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    while (num > 0) {
      rem = num % 16;
      hexadecimal = hexDeciamls[rem] + hexadecimal;
      num = num / 16;
    }
    return hexadecimal;
  }

  public static String binaryToDecimal(int inputNum) {
    int base = 1, num = inputNum, decimal = 0;

    while (num > 0) {
      int lastDigit = num % 10;
      decimal += lastDigit * base;
      base = base * 2;
      num = num / 10;
    }
    return String.valueOf(decimal);
  }

}
