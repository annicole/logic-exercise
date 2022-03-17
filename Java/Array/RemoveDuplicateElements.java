/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interview.Array;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ANA.ROSAS
 */
public class RemoveDuplicateElements {

  public static void main(String[] args) {
    removeDuplicates(new int[]{4, 3, 2, 4, 9, 2});

    removeDuplicates(new int[]{1, 2, 1, 2, 1, 2});
  }

  static void removeDuplicates(int arrayNum[]) {
    List<Integer> listNum = new ArrayList<Integer>();
    for (int i = 0; i < arrayNum.length; i++) {
      if (!listNum.contains(arrayNum[i])) {
        listNum.add(arrayNum[i]);
      }
    }
    System.out.println("Array without duplicate: " + listNum.toString());
  }
}
