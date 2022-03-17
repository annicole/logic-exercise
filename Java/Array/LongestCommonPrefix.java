/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interview.Array;

/**
 *
 * @author ANA.ROSAS
 */
public class LongestCommonPrefix {

  public static void main(String[] args) {
    String[] strs = {"a"};
    System.out.println( longestCommonPrefix(strs));
  }

  public static String longestCommonPrefix(String[] strs) {
    String result = "", aux = "";
    if (strs != null && strs.length > 0) {
      String firstString = strs[0];
      for (int i = 0; i < firstString.length() - 1; i++) {
        aux = firstString.substring(0, 1 + 1);
        if (haveString(aux, strs)) {
          result = (aux.length() > result.length()) ? aux : result;
        }
      }
    }
    return result;
  }

  static boolean haveString(String g, String[] strs) {
    for (int i = 1; i < strs.length; i++) {
      if (!strs[i].startsWith(g)) {
        return false;
      }
    }
    return true;
  }
}
