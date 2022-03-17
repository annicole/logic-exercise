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
public class YearToCentury {
    
    static int centuryFromYear(int year) {
        double auxDiv = (double) year / 100;
        int century = (int) Math.ceil(auxDiv);
        return century;
    }

    int centuryFromYear2(int year) {
        return 1 + (year - 1) / 100;
    }

    
}
