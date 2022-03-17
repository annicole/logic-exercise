/**
 * @param {number[]} nums1
 * @param {number[]} nums2
 * @return {number}
 */


/*
Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.

The overall run time complexity should be O(log (m+n)).

 

Example 1:

Input: nums1 = [1,3], nums2 = [2]
Output: 2.00000
Explanation: merged array = [1,2,3] and median is 2.


*/
 var findMedianSortedArrays = function(nums1, nums2) {
    
    let arrayAux = nums1.concat(nums2);
    arrayAux.sort(function(a,b){return a - b})
  
    let indexMedian = Math.floor( arrayAux.length/2);
    let median;
        if(arrayAux.length%2 === 1){
            median = arrayAux[indexMedian];
        }else{
            median = arrayAux[indexMedian-1] + arrayAux[indexMedian];
            median = median /2;
        }
    return median;
};