/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interview;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author ANA.ROSAS
 */

/*
Write a java program to find all pairs of elements in the given array whose sum is equal to a given number.
For example, if {4, 5, 7, 11, 9, 13, 8, 12} is an array and 20 is the given number,
then you have to find all pairs of elements in this array whose sum must be 20.
In this example, (9, 11), (7, 13) and (8, 12) are such pairs whose sum is 20. 
 */
public class FindPairsArray {

  public static int[] arrayInt = {4, 5, 7, 11, 9, 13, 8, 12};

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int num = in.nextInt();
    //solution(num);
    continuosSubarray(new int[]{12, 5, 31, 9, 21, 8}, num);
  }
//complexity O(n2)
  public static void solution(int num) {
    List<String> listaResultado = new ArrayList();
    for (int i = 0; i < arrayInt.length; i++) {
      for (int j = i + 1; j < arrayInt.length; j++) {
        if ((arrayInt[i] + arrayInt[j]) == num) {
          listaResultado.add(String.valueOf(arrayInt[i]) + "," + String.valueOf(arrayInt[j]));
        }
      }
    }
    if (listaResultado.size() > 0) {
      System.out.println("Los pares de números son :" + listaResultado.toString());

    }
    else {
      System.out.println("No se encontraron pares de números");
    }
  }

  /*Write a java program to find continuous sub array of the given array whose sum 
is equal to a given number. For example, If {12, 5, 31, 9, 21, 8} is the given array
and 45 is the given number, then you have to find continuous sub array in this array 
such that whose elements add up to 45. In this case, {5, 31, 9} is such sub array 
whose elements add up to 45. */
  public static void continuosSubarray(int[] arraySearch, int num) {
    for (int i = 0; i < arraySearch.length - 2; i++) {
      int auxI = arraySearch[i];
      int auxJ = arraySearch[i + 1];
      int auxK = arraySearch[i + 2];
      if ((auxI + auxJ + auxK) == num) {
        System.out.println("Continuos subarray : (" + auxI + "," + auxJ + "," + auxK + ")");
      }
    }
  }
}
