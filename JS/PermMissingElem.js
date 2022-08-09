/*
An array A consisting of N different integers is given. The array contains integers in the range [1..(N + 1)], which means that exactly one element is missing.

Your goal is to find that missing element.

Write a function:

class Solution { public int solution(int[] A); }

that, given an array A, returns the value of the missing element.

For example, given array A such that:

  A[0] = 2
  A[1] = 3
  A[2] = 1
  A[3] = 5
the function should return 4, as it is the missing element.

Write an efficient algorithm for the following assumptions:

N is an integer within the range [0..100,000];
the elements of A are all distinct;
each element of array A is an integer within the range [1..(N + 1)].


*/


function solution(nums) {
    // write your code in JavaScript (Node.js 8.9.4)
  let n = nums.length;
  let sum =  Math.floor((n + 1) * (n + 2) / 2)
  for (let i = 0; i < n; i++) {
    sum -= nums[i];
  }
  return sum;
}

var missingNumber = function(nums) {

    let aorder=nums.sort((a,b)=>a-b);
  
    for(let i = 0; i <=aorder.length; i++) {
  
      if (i !== aorder[i]) {
  
        return i;
      }
  
    } 
  };


  const missingNumber = nums => {
	const N = nums.length;
	let expected = (N * (N + 1)) / 2; // sum of range 1 to N

	for (const num of nums) expected -= num;

	return expected;
};