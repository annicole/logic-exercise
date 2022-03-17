/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interview;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;

/**
 *
 * @author ANA.ROSAS
 */
public class RemoveDuplicateElements {
 
  public static void main(String[] args) {
        ArrayList<String> listWithDuplicateElements = new ArrayList<String>();
 
        listWithDuplicateElements.add("JAVA");
 
        listWithDuplicateElements.add("J2EE");
 
        listWithDuplicateElements.add("JSP");
 
        listWithDuplicateElements.add("SERVLETS");
 
        listWithDuplicateElements.add("JAVA");
 
        listWithDuplicateElements.add("STRUTS");
 
        listWithDuplicateElements.add("JSP");
        solutionHashSet(listWithDuplicateElements);
   
  }
  
  public static void solutionHashSet(ArrayList<String> listWithDuplicateElements){
 
 
        //Printing listWithDuplicateElements
 
        System.out.print("ArrayList With Duplicate Elements :");
 
        System.out.println(listWithDuplicateElements);
 
        //Constructing HashSet using listWithDuplicateElements
 
        HashSet<String> set = new HashSet<String>(listWithDuplicateElements);
 
        //Printing listWithoutDuplicateElements
 
        System.out.print("ArrayList After Removing Duplicate Elements :");
 
        System.out.println(set);
  }
  
  public static void likedHashSet(ArrayList<String> listWithDuplicateElements){
     System.out.print("ArrayList With Duplicate Elements :");
 
        System.out.println(listWithDuplicateElements);
 
        //Constructing LinkedHashSet using listWithDuplicateElements
 
        LinkedHashSet<String> set = new LinkedHashSet<String>(listWithDuplicateElements);

        //Printing listWithoutDuplicateElements
 
        System.out.print("ArrayList After Removing Duplicate Elements :");
 
        System.out.println(set);
  }
  
  public static <T> ArrayList<T> removeDuplicates(ArrayList<T> list) 
    { 
  
        // Create a new ArrayList 
        ArrayList<T> newList = new ArrayList<T>(); 
  
        // Traverse through the first list 
        for (T element : list) { 
  
            // If this element is not present in newList 
            // then add it 
            if (!newList.contains(element)) { 
  
                newList.add(element); 
            } 
        } 
  
        // return the new list 
        return newList; 
    } 
  
}
