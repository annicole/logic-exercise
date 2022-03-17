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
public class MaximumMinimum {
  
  static class Pair{
    int min;
    int max;
    
  }
  
  public static void main(String[] args) {
     int arr[] = {1000, 11, 445, 1, 330, 3000}; 
        Pair minmax = getMinMax(arr); 
        System.out.printf("\nMinimum element is %d", minmax.min); 
        System.out.printf("\nMaximum element is %d", minmax.max); 
  }
  
  static Pair getMinMax(int arrayNum[]){
    
    Pair minmax = new Pair();
    int n= arrayNum.length;
    
    if(n ==1){
      minmax.max= arrayNum[0];
    minmax.min= arrayNum[0];
    return minmax;
    }
    if(arrayNum[0]> arrayNum[1]){
       minmax.max = arrayNum[0]; 
            minmax.min = arrayNum[1]; 
    }else{
      minmax.max = arrayNum[1];
      minmax.min = arrayNum[0];
    }
    for (int j = 2; j < n; j++) {
      if(arrayNum[j]> minmax.max){
        minmax.max = arrayNum[j];
      }else if(arrayNum[j]< minmax.min){
         minmax.min = arrayNum[j];
      }
    }
    return minmax;
  }
}
