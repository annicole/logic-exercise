
/**
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Output: Because nums[0] + nums[1] == 9, we return [0, 1].
 * 
 */

var lengthOfLongestSubstring = function(s) {
    let aux;
    let res = 0;
    const arraysubstring = new Map();
    for(let i=0; i< s.length ; i++){
        for(let j = i+1;j <s.length; j++){
            aux = s.substring(i,j);
            console.log(aux);
            if(allUnique(aux)){
                console.log("unique")
                res= Math.max(res, aux.length);
            }
        }
    }
    return res;
};
    
let allUnique = (exp)=>{
    let aux = new Map();
    for(let i=0;i<exp.length;i++){
        if(aux.has(exp.charAt(i))){
            return false;
        }else{
            aux.set(exp.charAt(i),i);
        }
    }
     return true;
}