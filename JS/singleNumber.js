/*

Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

You must implement a solution with a linear runtime complexity and use only constant extra space.

Example 1:

Input: nums = [2,2,1]
Output: 1
*/


var singleNumber = function(nums) {
   let mapNum = new Map();
   let num;
   for(let num of nums){
       
       if(!mapNum.has(num)){
           mapNum.set(num,1);
       }else{
           mapNum.delete(num);
       }
   }
   
   for (const key of mapNum.keys()) {
       num = key;
}
   return num;
};

var singleNumber = function(nums) {
    let res = 0
    for(let num of nums){
        res ^= num
    }
    return res
};