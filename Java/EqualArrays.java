/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author ANA.ROSAS
 */
public class EqualArrays {

  public static void main(String[] args) {

  }

  public static void checkEqual() {
    int[] arrayOne = {5, 8, 9, 78, 100};
    int[] arrayTwo = {5, 8, 15, 58, 100};
    boolean isEqual = false;

    if (arrayOne.length == arrayTwo.length) {
      for (int i = 0; i < arrayOne.length; i++) {
        if (arrayOne[i] != arrayTwo[i]) {
          isEqual = false;
          break;
        }
        else {
          isEqual = true;
        }
      }
    }
    System.out.println("The two arrays are " + (isEqual ? "equals" : " not equals"));
  }

  public static void checkEqual2() {
    String[] s1 = {"java", "j2ee", "struts", "hibernate"};
    String[] s2 = {"jsp", "spring", "jdbc", "hibernate"};
    String[] s3 = {"java", "j2ee", "struts", "hibernate"};
    String[] s4 = {"java", "swings", "j2ee", "struts", "jsp", "hibernate"};
    String[] s5 = {"java", "struts", "j2ee", "hibernate", "swings", "jsp"};
    Arrays.sort(s4);
    Arrays.sort(s5);

    System.out.println(Arrays.equals(s1, s2));        //Output : false
    System.out.println(Arrays.equals(s1, s3));
    System.out.println(Arrays.equals(s4, s5));
  }

  public static void checkEqual3() {
    String[][] s1 = {{"java", "swings", "j2ee"}, {"struts", "jsp", "hibernate"}};

    String[][] s2 = {{"java", "swings", "j2ee"}, {"struts", "jsp", "hibernate"}};

    System.out.println(Arrays.deepEquals(s1, s2));     //Output : true

    //Calling equals() method on same arrays will return false
    System.out.println(Arrays.equals(s1, s2));        //Output : false

    //That's why use deepEquals() method to compare multidimensional arrays
  }

}
