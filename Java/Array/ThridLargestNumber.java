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
public class ThridLargestNumber {

  public static void main(String[] args) {
    int[] arr = {1, 14, 2, 16, 10, 20};
    findLargest(arr);
  }

  static void findLargest(int[] arrayNum) {
    int first = 0, second = 0, third = 0;
    for (int i = 0; i < arrayNum.length; i++) {
      if (arrayNum[i] > first) {
        third = second;
        second = first;
        first = arrayNum[i];
      }
      else if (arrayNum[i] > second) {
        third = second;
        second = arrayNum[i];
      }
      else if (arrayNum[i] > third) {
        third = arrayNum[i];
      }
    }
    System.out.println("The third largest elements is : " + third);
  }
}
