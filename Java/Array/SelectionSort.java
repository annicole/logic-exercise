/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interview.Array;

import java.util.Arrays;

/**
 *
 * @author ANA.ROSAS
 */
public class SelectionSort {

  public static void main(String[] args) {
    selectionSort(new int[]{45, 84, 101, 62, 12, 45});

    selectionSort(new int[]{62, -45, 14, 8, -52, 45});

    selectionSort(new int[]{21, 12, 56, -48, 15, 45});
  }

  public static void selectionSort(int[] inputArray) {
    int temp, pos;

    for (int i = 0; i < inputArray.length - 1; i++) {
      pos = i;
      for (int j = i + 1; j < inputArray.length; j++) {
        if (inputArray[j] < inputArray[pos]) {
          pos = j;
        }
      }

      temp = inputArray[i];
      inputArray[i] = inputArray[pos];
      inputArray[pos] = temp;

      System.out.println(Arrays.toString(inputArray));
    }
  }

}
