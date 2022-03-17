/*
Given a positive integer k, you need to find the length of the smallest positive integer n such that n is divisible by k, and n only contains the digit 1.

Return the length of n. If there is no such n, return -1.

Note: n may not fit in a 64-bit signed integer.

Input: k = 1
Output: 1
Explanation: The smallest answer is n = 1, which has length 1.

Input: k = 3
Output: 3
Explanation: The smallest answer is n = 111, which has length 3.

*/
package interview;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author ANA.ROSAS
 */



class Solution {
    public int smallestRepunitDivByK(int k) {
        if(k%2==0 || k%5==0)
            return -1;
        int resModule=0;
        for(int i=1;i<=k;i++)
        {
            resModule=(resModule*10+1)%k;
            if(resModule==0)
                return i;
        }
        
        return -1;
    }
}