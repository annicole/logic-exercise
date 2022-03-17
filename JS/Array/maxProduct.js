/***
 * 
 * 
 * Given an array of integers, find the pair of adjacent elements that has the largest product and return that product.

Example

For inputArray = [3, 6, -2, -5, 7, 3], the output should be
solution(inputArray) = 21.
 */


function solution(arr) {
    return Math.max(...arr.slice(1).map((x,i)=>[x*arr[i]]))
  }
  