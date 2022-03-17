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
public class PyramidNumber {
  
  public static void main(String[] args) {
    floydTriangle();
  }
  
  public static void pyramidOne(){
    String caracter="";
    int num;
    Scanner in = new Scanner(System.in);
    System.out.println("Enter number or any other simbol:");
    caracter = in.nextLine();
    System.out.println("Enter number of times");
    num = in.nextInt();
    for (int i = 1; i <= num; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print(caracter);
      }
      System.out.println("");
    }
  }
  
  public static void pyramidNumbers(){
    int numberTime;
    Scanner in = new Scanner(System.in);
    System.out.println("Enter number of times");
    numberTime = in.nextInt();
    System.out.println("Pyramid:");
    for (int i = 0; i < numberTime; i++) {
      for (int j = 0; j <= i; j++) {
        System.out.print(String.valueOf(j + 1)+ " ");
      }
      System.out.println("");
    }
  }
  
  public static void floydTriangle(){
    int numberTime,aux=1;
    Scanner in = new Scanner(System.in);
    System.out.println("Enter number of times");
    numberTime = in.nextInt();
    System.out.println("Floyd's Triangle:");
    for (int i = 1; i < numberTime; i++) {
      for (int j = 1; j <= i; j++) {
        //String.valueOf(i + 1)
        //String.valueOf(i + j)
        System.out.print(String.valueOf(aux)+ " ");
        aux ++;
      }
      System.out.println("");
    }
  }
}
