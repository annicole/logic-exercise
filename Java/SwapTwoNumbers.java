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
public class SwapTwoNumbers {
   // Write a Java Program to swap two numbers without using the third variable.
  public static void swap(){
    Scanner in = new Scanner(System.in);
    Integer numberOne = in.nextInt();
    Integer numberTwo= in.nextInt();
    numberTwo = numberOne + numberTwo;
    numberOne = numberTwo - numberOne;
    numberTwo = numberTwo - numberOne;
    System.out.println("Numero uno cambiado: " + numberOne);
    System.out.println("Numero dos cambiado: " + numberTwo);
    
  }
  
}
