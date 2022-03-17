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
public class ReverseEachWord {
  
  public static void main(String[] args) {
    String input = new Scanner(System.in).nextLine();
    reverseWord(input);
  }
  
  //Reverse each word
  public static void reverseWord(String s){
    String[] arrayWord = s.split(" ");
    StringBuilder stringB = new StringBuilder();;
    for (int i = 0; i < arrayWord.length; i++) {
        for(int j = arrayWord[i].toCharArray().length-1 ; j>= 0; j -- ){
          stringB.append(arrayWord[i].charAt(j));
        }
        stringB.append(" ");
    }
    System.out.println(stringB.toString());
  }
  
  //Reverse the order of the words
   static String reverseSentence(String sentence) {
        String[] arrayAux = sentence.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = arrayAux.length - 1; i >= 0; i--) {
            sb.append(arrayAux[i]);
            sb.append(" ");
        }

        return sb.toString().trim();
    }
}
