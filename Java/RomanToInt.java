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
public class RomanToInt {

  public int romanToInt(String s) {
    int prevVal = 9999;
    int sum = 0;

    for (char sym: s.toCharArray()) {
      int symVal = 0;
      switch (sym) {
        case 'I':
          symVal = 1;
          break;
        case 'V':
          symVal = 5;
          break;
        case 'X':
          symVal = 10;
          break;
        case 'L':
          symVal = 50;
          break;
        case 'C':
          symVal = 100;
          break;
        case 'D':
          symVal = 500;
          break;
        case 'M':
          symVal = 1000;
          break;
      }

      if (prevVal < symVal) {
        sum = sum - prevVal;
        sum = sum + symVal - prevVal;
      }
      else {
        sum = sum + symVal;
      }

      prevVal = symVal;
    }

    return sum;
  }
}
