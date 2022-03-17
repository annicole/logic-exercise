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
public class FindIterations {

  public static void main(String[] args) {
    int[] array = {1, 1, 1, 6, 1, 1, 1};
    int iteraciones = getIterations(array);
    System.out.println("Numero de iteraciones: " + iteraciones);
  }

  static int getIterations(int[] arrayNum) {
    int iterations = 0, i = 0, j = 1;
    int[] num = arrayNum;
    while (i < num.length) {
      if (i != j) {
        if (num[i] == num[j]) {
          iterations++;
          num[j] = num[j] + 1;
        }
      }
      j++;
      if (j == num.length) {
        i++;
        j = 0;
      }
    }
    System.out.println("Array Resultante: " + Arrays.toString(num));
    return iterations;
  }
}
