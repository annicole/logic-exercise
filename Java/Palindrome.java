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

 /*
Given an integer x, return true if x is palindrome integer.

An integer is a palindrome when it reads the same backward as forward.

For example, 121 is a palindrome while 123 is not.


 */
public class Palindrome {

    public static void main(String[] args) {
        char[] auxArray;
        int contReverse;
        boolean isPalindrome = true;
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        auxArray = str.replaceAll("\\s+", "").toCharArray();
        for (int i = 0, reverse = auxArray.length - 1; i < auxArray.length - 1; i++, reverse--) {
            /* contReverse = (auxArray.length - 1) - i;*/
            if (Character.toLowerCase(auxArray[i]) != Character.toLowerCase(auxArray[reverse])) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println(str + ": " + (isPalindrome ? " es palindrome" : "no es palindrome"));
    }

    static boolean checkPalindrome(String inputString) {
        for (int i = 0; i < inputString.length() / 2; i++) {
            if (inputString.charAt(i) != inputString.charAt(inputString.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }

    boolean checkPalindrome2(String inputString) {
        int i = 0;
        int j = inputString.length() - 1;
        while (i < inputString.length() && j > 0) {
            if (inputString.charAt(i) != inputString.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    //Palindrome number
     public boolean isPalindrome(int x) {
      String auxNum = String.valueOf(x);
      char []auxChar= auxNum.toCharArray();
      boolean isPalindrome = true;
        for(int i=0, j= auxChar.length -1; i< auxChar.length/2; i++, j--){
            System.out.println("Values" + auxChar[i]+ "," + auxChar[j]);
            if(auxChar[i] != auxChar[j]){
                return false;
            }
        }
        return true;
    }

}


  public static String checkPalindrome(String s){
        StringBuilder sb = new StringBuilder(s.toLowerCase());
        System.out.println("test: " + sb.reverse().toString() + " s: " +s.toLowerCase() );
        if(sb.reverse().toString().equals(s)){
            return "yes";
        }
        return "no";
    }