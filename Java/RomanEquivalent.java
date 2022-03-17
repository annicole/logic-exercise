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
public class RomanEquivalent {
  
  public static void main(String[] args) {
    System.out.println("Enter a number: ");
    int inputNumber = new Scanner(System.in).nextInt();
    decimalToRoma(inputNumber);
  }
  
  public static void decimalToRoma(int inputNumber){
    
    String[] romanSymbols = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
    int[] decimals ={1000,900,500,400,100,90,50,40,10,9,5,4,1};
    int num = inputNumber;
    String roman="";
    
    if(num>=1 && num<= 3999){
      for (int i = 0; i < 13; i++) {
        while(num>=decimals[i]){
          num = num - decimals[i];
          roman = roman + romanSymbols[i];
        }
      }
      System.out.println("Roman equivalent :" + roman);
    }else{
      System.out.println("Equivalent number");
    }
  }
}
