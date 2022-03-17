/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interview.Array;

import java.util.Collection;

/**
 *
 * @author ANA.ROSAS
 */
public class MedianArray {

  //Find the median of the two sorted arrays. 
  /*nums1 = [1, 3]
nums2 = [2]

The median is 2.0*/
  public double findMedianSortedArrays(int[] nums1, int[] nums2) {
    double median = 0;
    int m = nums2.length, n = nums1.length;
    int size = m + n;
    int[] arrayAux = new int[(size / 2) + 1];
    int med = size / 2, k = 0, j = 0;
    for (int i = 0; i <= med; i++) {
      if (j >= n) {
        arrayAux[i] = nums2[k];
        k++;
      }
      else if (k >= m) {
        arrayAux[i] = nums2[j];
        j++;
      }
      else if (nums1[j] < nums2[k]) {
        arrayAux[i] = nums1[j];
        j++;
      }
      else {
        arrayAux[i]= nums2[k];
        k++;
      }
    }
    
    if(size %2 ==0){
      median = (arrayAux[med -1] + arrayAux[med])/2.0;
    }else{
      median = arrayAux[med];
    }
    return median;
  }
}
