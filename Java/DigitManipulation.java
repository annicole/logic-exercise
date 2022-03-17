/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interview;

/**
 *
 * @author Nicole
 */
public class DigitManipulation {
    
    //Given a number, return the result of the
    // product- sum of all digits
    // Example  123 = (1*2*3) -(1+2+3)= 6 - 6 = 0
    static int digitsManipulations(int n) {
        String aux = Integer.toString(n);
        int product = 1;
        int sum = 0;
        int numAux = 0;
        for (int i = 0; i < aux.length(); i++) {
            numAux = Character.getNumericValue(aux.charAt(i));
            product = product * numAux;
            sum = sum + numAux;
        }
        return product - sum;
    }

    static int digistsManipulations2(int n) {
        int product = 1;
        int sum = 0, aux = n, numAux = 0;
        while (aux > 0) {
            numAux = aux % 10;
            product *= numAux;
            sum += numAux;
            aux /= 10;
        }
        return product - sum;
    }
    
}
