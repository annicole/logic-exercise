/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interview;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

/**
 *
 * @author ANA.ROSAS
 */
public class DuplicateElements {
  
  public static void main(String[] args) {
    int [] inputArray={54,2,18,78,9,154,54};
    
    Set<Integer> uniqueElements = new HashSet<>();
         
    Set<Integer> duplicateElements =  Arrays.stream(inputArray)
                                            .filter(i -> !uniqueElements.add(i))
                                            .boxed()
                                            .collect(Collectors.toSet());
         
    System.out.println(duplicateElements);
    
  }
}
