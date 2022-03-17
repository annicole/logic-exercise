/*
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Output: Because nums[0] + nums[1] == 9, we return [0, 1].

*/

class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] arrayResponse = new int[2];
        int sum2Values=0;
        for(int i = 0; i< nums.length-1;i++ ){
            for(int j=i+1;j<= nums.length -1;j++){
               sum2Values= nums[i]+ nums[j];
                if(sum2Values ==target){
                    arrayResponse[0] = i;
                    arrayResponse[1] = j;
                    break;
                }
            }
            
        }
    return arrayResponse;
    }

}