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
public class BinarySearch {
  
  public static void main(String[] args) {
    int arr[] = {2,3,4,10,40}; 
        int n = arr.length; 
        int x = 10; 
        int result = binarySearch(arr,0,n-1,x); 
        if (result == -1) 
            System.out.println("Element not present"); 
        else
            System.out.println("Element found at index " +  
                                                 result); 
  }
  
  static int binarySearch(int[] arrayNum,int begin, int end, int numFind){
    if (end>=1) {
        int mid = begin +(end-1)/2;
        // If the element is present at the  
            // middle itself 
        if(arrayNum[mid] == numFind)
          return mid;
        // If element is smaller than mid, then  
            // it can only be present in left subarray 
        if(arrayNum[mid]> numFind)
          return binarySearch(arrayNum, begin, mid-1, numFind);
        
       // Else the element can only be present 
            // in right subarray 
        return binarySearch(arrayNum, mid +1, end, numFind);
    }
    return -1;
  }
}
