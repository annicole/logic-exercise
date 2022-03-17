/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interview;

import java.util.Scanner;
import java.util.stream.Stream;

/**
 *
 * @author ANA.ROSAS
 */
public class ReverseString {
  
  // Write a Java Program to reverse a string without using String inbuilt function.
  
  public static void  methodOne(String str){
    StringBuilder strReturn = new StringBuilder();
    //strReturn.append(str); short solution
    //strReturn.reverse();
    char [] auxChar = str.toCharArray();
    for (int i = auxChar.length -1 ; i >= 0; i--) {
        strReturn.append(auxChar[i]);
    }
    System.out.println("Solution one : " + strReturn.toString());
  }
  
   public static String  methodOneStream(String str){
    Stream stream = Stream.of(str);
    stream.forEach(e-> e.toString());
    return "";
  }
  
  public static void methodTwo(String str){
    String strReturn ="";
    for (int i = str.length() - 1 ; i >= 0; i--) {
        strReturn = strReturn.concat(String.valueOf(str.charAt(i)));
    }
    System.out.println("Solution two : "+ strReturn);
  }
  
  public static void methodTree(){
    String original,reverse ="";
    System.out.println("Enter the string to be reversed");
    Scanner in = new Scanner(System.in);
    original = in.nextLine();
    for (int i = original.length() -1 ; i >= 0; i--) {
        reverse = reverse + original.charAt(i);
    }
    System.out.println("Solution with scanner : " + reverse);
  }
  
  public String recursiveMethod(String str){
    if(str == null || str.length()<= 1){
      return str;
    }
    return recursiveMethod(str.substring(1)) + str.charAt(0);
  }
}
