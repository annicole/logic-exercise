/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interview.Array;

/**
 *
 * @author Nicole
 */
public class SubarraysPrime {
    
    //Array of integer, get the number of subarrays that the sum of them, 
    //are prime
    static int getSubArrays(int[] arrayNum) {
        int cont = 0;
        int sum = 0, max = arrayNum.length;
        for (int i = 0; i < max; i++) {
            sum = 0;
            for (int j = i; j < max; j++) {
                sum = sum + arrayNum[j];
                if (isPrime(sum)) {
                    cont++;
                }
            }
        }

        return cont;
    }

    static boolean isPrime(int number) {
        int aux = 0;
        for (int i = 2; i < number; i++) {
            aux = number % i;
            if (aux == 0) {
                return false;
            }
        }
        return true;
    }
    
}
