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
public class Fibonacci {
  public static void main(String[] args) {
    int num, a = 0,b=0, c =1;
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the number of times");
    num =in.nextInt();
    System.out.println("Fibonnacci serie:");
    for (int i = 0; i <= num; i++) {
      a = b;
      b= c;
      c = a +b;
      System.out.println(a + " ");
    }

  }
  static int n1=1,n2=1,n3=0;
  
  static void printFibonacci(int count){
    if (count>0) {
      n1= n2;
      n2= n3;
      n3= n1 +n2;
      System.out.println("" + n3);
      printFibonacci(count-1);
    }
  }
}
