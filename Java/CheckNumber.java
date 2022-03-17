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
public class CheckNumber {

  public static void main(String[] args) {
    String input = new Scanner(System.in).next();
    System.out.println(checkJava8(input));

  }

  public static String checkJava8(String someString) {
    boolean isNumeric = someString.chars().allMatch(Character::isDigit);
    return isNumeric ? "Es Número" : "No es número";
  }

  public static boolean isNumericRegex(String str) {
    if (str == null) {
      return false;
    }
    return str.matches("-?\\d+");
  }
  
  public static boolean isNumericArray(String str) {
    if (str == null)
        return false;
    char[] data = str.toCharArray();
    if (data.length <= 0)
        return false;
    int index = 0;
    if (data[0] == '-' && data.length > 1)
        index = 1;
    for (; index < data.length; index++) {
        if (data[index] < '0' || data[index] > '9') // Character.isDigit() can go here too.
            return false;
    }
    return true;
}
}
