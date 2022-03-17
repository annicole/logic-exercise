/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interview;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author ANA.ROSAS
 */
public class StringToInteger {

  public static void main(String[] args) {
    System.out.println(myAtoi("word 78"));
  }

  public static int myAtoi(String str) {
    int res = 0;
    try {
      Pattern p = Pattern.compile("\\s*([+-]?\\d+).*");
      Matcher m = p.matcher(str);
      if (m.find()) {
          res = Integer.valueOf(str);
      }
    }
    catch (Exception e) {
      res = Integer.MIN_VALUE;
    }
    return res;
  }
}
