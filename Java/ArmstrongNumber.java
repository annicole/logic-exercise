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
public class ArmstrongNumber {

  public static void main(String[] args) {
    armstrongNumber();
  }

  public static void armstrongNumber() {
    Integer length, result = 0, aux;
    String number;
    boolean isArmstrong;
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the number:");
    number = in.nextLine().replace(" ", "");
    if (number.length() > 1 && !number.equals("0")) {
      length = number.length();
      for (Character c: number.toCharArray()) {
        aux = (int)Math.pow(Integer.valueOf(c.toString()), length);
        result = result + aux;
      }
    }
    isArmstrong = Integer.compare(result, Integer.valueOf(number)) == 0;
    System.out.println("El número: " + number + " " + (isArmstrong ? "si es armstrong  ": " no es armstrong "));
  }
}
