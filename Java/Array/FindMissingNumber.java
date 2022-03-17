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
public class FindMissingNumber {

  public static void main(String[] args) {
    int array[] = {1,2,4,5,6};
    System.out.println("Missing number :" +  getMissing(array));
  }

  //Time Complexity: O(n)
  static int getMissing(int a[]) {
    int  total=0;
    // sum of numbers total = n*(n+1)/2
    total = (a.length +1) * (a.length +2) /2;
    for (int j = 0; j < a.length; j++) {
      total -= a[j];
    }
    return total;
  }
}
