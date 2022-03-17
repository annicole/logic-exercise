/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interview;

import java.util.Arrays;

/**
 *
 * @author ANA.ROSAS
 */
public class SecondLargestNumber {

  public static void main(String[] args) {
    seconLargest();
  }

  public static void seconLargest() {
    int[] arrayInt = {5, 180, 15, 28, 150, 78, 69};
    int secondLargest = 0, length;

    Arrays.sort(arrayInt);
    length = arrayInt.length - 2;
    secondLargest = arrayInt[length];
    System.out.println("Result : " + secondLargest);
  }

  public static void seconLargest2() {
    int firstLargest, secondLargest;
    int[] input = {34, 56, 78, 90, 234, 48, 150};
    //Checking first two elements of input array
    if (input[0] > input[1]) {
      //If first element is greater than second element
      firstLargest = input[0];
      secondLargest = input[1];
    }
    else {
      //If second element is greater than first element
      firstLargest = input[1];
      secondLargest = input[0];
    }

    //Checking remaining elements of input array
    for (int i = 2; i < input.length; i++) {
      if (input[i] > firstLargest) {
        //If element at 'i' is greater than 'firstLargest'
        secondLargest = firstLargest;
        firstLargest = input[i];
      }
      else if (input[i] < firstLargest && input[i] > secondLargest) {
        //If element at 'i' is smaller than 'firstLargest' and greater than 'secondLargest'
        secondLargest = input[i];
      }
    }
  }
}
