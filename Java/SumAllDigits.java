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
public class SumAllDigits {

  public static void main(String[] args) {
    int num;
    Scanner sc = new Scanner(System.in);
    num = sc.nextInt();
    suma2(num);
  }

  public static void suma1(int num) {
    String numAux = String.valueOf(num);
    Integer suma = 0;
    for (Character c: numAux.toCharArray()) {
      suma = suma + Integer.valueOf(c.toString());
    }
    System.out.println("Suma :" + suma);
  }

  public static void suma2(int num) {
    Integer suma = 0;
    while (num != 0) {
      int lastDigit = num % 10;
      suma = suma + lastDigit;
      num = num / 10;
    }
    System.out.println("La suma es : "+ suma);

  }

}
