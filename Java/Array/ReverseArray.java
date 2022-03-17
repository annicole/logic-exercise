/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interview.Array;

import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @author ANA.ROSAS
 */
public class ReverseArray {
  public static void main(String[] args) {
     int[]  arrayInt = {80,478,58,12,5,35,59};
     int[]  resultArray = new int[arrayInt.length];
     for (int i = arrayInt.length-1,j=0; i >= 0; i--,j++) {
        resultArray[j]=arrayInt[i];
    }
    
     System.out.println(Arrays.toString(resultArray));
  }
  
  public void method1(){
    Integer[] array = {5,15,24,120,65,235};
    
    Arrays.sort(array);
    Arrays.sort(array,Collections.reverseOrder());
    System.out.println(Arrays.toString(array));
    Arrays.asList(array).stream().forEach(s-> System.out.println(s));
  }
}
