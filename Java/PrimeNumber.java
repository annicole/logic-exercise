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
public class PrimeNumber {
  
   public static void main(String[] args) {
    Integer num, temp=0;
    boolean isPrime = true;
    Scanner sn = new Scanner(System.in);
     num = sn.nextInt();
    for (int i = 2; i <= num /2; i++) {
      temp = num%i;
      if(temp == 0){
        isPrime = false;
        break;
      }
    }
    
     System.out.println("El numero " + ( isPrime ? "es primo!" : " no es primo !"));
    
  }
}
