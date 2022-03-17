/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

 Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].

The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.

You must write an algorithm that runs in O(n) time and without using the division operation.

 

Example 1:

Input: nums = [1,2,3,4]
Output: [24,12,8,6]
 */
package interview.Array;

/**
 *
 * @author Nicole
 */


 class Solution {
    public int[] productExceptSelf(int[] nums) {
        int product = 1;
        int[] arrayResult = new int[nums.length];
        for(int i=0;i<nums.length;i++){
           product = 1;
           for(int j=0;j<nums.length;j++){
               if(i!=j){
                   product = product*nums[j];
               }
           }
            System.out.println("produtc" + product);
            arrayResult[i] = product;
    }
        return arrayResult;
    }
    
}