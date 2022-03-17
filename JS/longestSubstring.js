

/**
 * @param {string} s
 * @return {number}
 */

/**
 * 
 * Given a string s, find the length of the longest substring without repeating characters.
Example 1:
Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
 */
var lengthOfLongestSubstring = function(s) {
        let mySet = new Set();
        let start = 0;
        let end = 0;
        let max = 0;
        
        while (end<s.length) {
            if(!mySet.has(s[end])) {
                mySet.add(s[end]);
                end++;
                max = Math.max(mySet.size, max);
            } else {
                mySet.delete(s[start]);
                start++;
            }
        }
        
        return max;
};
  