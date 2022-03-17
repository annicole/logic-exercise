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
public class LongestPalindrome {
  
  public static void main(String[] args) {
    System.out.println("Resultado : "+ getLongest("bb")); 
  }
  
  static String getLongest(String s){
    String result="",aux="";
    if(s.length()<= 1) return s;
    for (int i = 0; i < s.length(); i++) {
      for (int j = i; j < s.length(); j++) {
        aux =s.substring(i,j+1);
         if(isPalindrome(aux)){
           result = ( aux.length() > result.length()) ? aux : result;
         }
      }
    }
    return result;
  }
  
  static boolean isPalindrome(String str){
    boolean isPalindrome = true;
      for (int i = 0,j= str.length()-1; i < str.length()-1; i++, j--) {
        if(Character.toLowerCase(str.charAt(i))  !=  Character.toLowerCase( str.charAt(j))){
           return false;
        }
    }
    return isPalindrome;
  }
  
  public String longestPalindrome(String s) {
    if (s == null || s.length() < 1) return "";
    int start = 0, end = 0;
    for (int i = 0; i < s.length(); i++) {
        int len1 = expandAroundCenter(s, i, i);
        int len2 = expandAroundCenter(s, i, i + 1);
        int len = Math.max(len1, len2);
        if (len > end - start) {
            start = i - (len - 1) / 2;
            end = i + len / 2;
        }
    }
    return s.substring(start, end + 1);
}

private int expandAroundCenter(String s, int left, int right) {
    int L = left, R = right;
    while (L >= 0 && R < s.length() && s.charAt(L) == s.charAt(R)) {
        L--;
        R++;
    }
    return R - L - 1;
}
}
