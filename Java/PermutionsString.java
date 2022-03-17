/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interview;

/**
 *
 * @author ANA.ROSAS
 */
public class PermutionsString {
 
  public static void main(String[] args) {
    StringPermutation("JSP");
  }
  
   static public void StringPermutation(String input)
    {
        StringPermutation("", input);
    }
     
   
  public static void StringPermutation(String permution,String input){
    if(input.length() == 0){
        System.out.println(permution);
    }else{
      for (int i = 0; i < input.length(); i++) {
        StringPermutation(permution + input.charAt(i), input.substring(0,i) + input.substring(i+1, input.length()));
      }
    }
  }
}
