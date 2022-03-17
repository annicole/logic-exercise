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
public class FindMaxSubArray {
  
    public static void main(String[] args) {
        System.out.println( maxProduct(new int [] {-23, 4, -3, 8, -12}));
    }
    
    static public int maxSubArray(int[] nums) {
        
        int maxSum = nums[0];
        
        for (int numsIndex = 1; numsIndex < nums.length; numsIndex++) {
            maxSum = Math.max(nums[numsIndex-1] + nums[numsIndex], maxSum);
            //maxSum = Math.max(maxSum, nums[numsIndex]);
        }
        
        return maxSum;
    }
    
    /*
    Given an array of integers, find the pair of 
    adjacent elements that has the largest product and return that product.
    */
    static public int maxProduct(int[] nums) {
        int maxSum = 0;
        for (int numsIndex = 1; numsIndex < nums.length; numsIndex++) {
            maxSum = Math.max(nums[numsIndex-1] * nums[numsIndex], maxSum);
            //maxSum = Math.max(maxSum, nums[numsIndex]);
        }
        
        return maxSum;
    }
}
