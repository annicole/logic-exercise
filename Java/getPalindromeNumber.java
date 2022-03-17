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
public class getPalindromeNumber {
  
  public static void main(String[] args) {
    int inputNumber = new Scanner(System.in).nextInt();
    
  }
  
  public static void reverseAndAdd(int num){
  
  }
  
  public static boolean checkPalindrome(int num){  
    int reverse = reverseNum(num);
    if(reverse == num)
      return true;
    else
      return false;
  }
  
  public static int reverseNum(int inputNum){
    int reverse =0,rem = 0,num = inputNum;
    while(num>0){
      //get las digit
      rem = rem %10;
      reverse = (reverse *10) + rem;
      num= num /10;
    }
    return reverse;
  }
}
