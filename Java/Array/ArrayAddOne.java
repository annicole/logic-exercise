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
public class ArrayAddOne {
    
    //Given an array, add one of all digits, return another array
    // Example [1,2,3] = [1,2,4]
    // [9,9,9] = [1,0,0,0]

    static int[] addOne(int[] digits) {
        String numAux = "";
        int sumAux = 0;
        for (int n : digits) {
            numAux = numAux.concat(String.valueOf(n));
        }
        sumAux = Integer.valueOf(numAux) + 1;
        numAux = String.valueOf(sumAux);
        int sizeArray = numAux.length();
        int[] arrayResult = new int[sizeArray];
        for (int i = 0; i < numAux.length(); i++) {
            arrayResult[i] = Character.getNumericValue(numAux.charAt(i));
        }
        return arrayResult;

    }

    static public int[] addToArrayForm(int[] arrayNum) {
        int aux = 1, numResult = 0, size = 0;
        for (int i = arrayNum.length - 1; i >= 0; i--) {
            numResult += (arrayNum[i] * aux);
            aux *= 10;
        }
        numResult++;
        size = String.valueOf(numResult).length();
        int[] result = new int[size];
        for (int i = result.length - 1; i >= 0; i--) {
            aux = numResult % 10;
            result[i] = aux;
            numResult /= 10;
        }
        return result;
    }

}
