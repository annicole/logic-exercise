/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interview;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 *
 * @author ANA.ROSAS
 */
public class FindSubstring {

  public static void main(String[] args) {

    System.out.println("Longuest sustring " + getLongest2("homeless"));
  }

  public static int getLongest(String s){
     int res = 0;
    for (int i = 0; i < s.length(); i++) {
      for (int j = i+1; j < s.length(); j++) {
        if(allUnique(s, i, j))
          res = Math.max(res, j -i);
      }
    }
    return res;
  }
    //complexity =O(n3)
  static boolean allUnique(String str, int start, int end) {
    String strAux = "";

    for (int i = start ; i< end ; i++) {
      if (strAux.contains(String.valueOf(str.charAt(i)))) {
        return false;
      }
      else {
        strAux = strAux.concat(String.valueOf(str.charAt(i)));
      }
    }
    return true;
  }
  

  //complexity O(n)
  public static int getLongest2(String s){
    int res = 0,i=0,j=0;
    HashSet<Character> set = new HashSet<>();
    while (i<s.length() && j< s.length()) {
      if(!set.contains(s.charAt(j))){
          set.add(s.charAt(j++));
          res = Math.max(res, j-i);
          System.out.println(set.toString());
      }else{
        set.remove(s.charAt(i++));
      }
      
    }
    return res;
  }
}
