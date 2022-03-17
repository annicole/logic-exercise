/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interview;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author ANA.ROSAS
 */
public class Anagram {

  public static void main(String[] args) {
    anagram1();
  }

  public static void anagram1() {
    String auxString1;
    String auxString2;
    boolean isAnagram;
    HashMap<Character, Integer> map1 = new HashMap<>();
    HashMap<Character, Integer> map2 = new HashMap<>();
    System.out.println("Enter the first string: ");
    Scanner in = new Scanner(System.in);
    auxString1 = in.nextLine();
    System.out.println("Enter the second string: ");
    auxString2 = in.nextLine();
    char[] auxChar1, auxChar2;
    auxChar1 = auxString1.replace(" ","").toLowerCase().toCharArray();
    auxChar2 = auxString2.replace(" ","").toCharArray();

    Arrays.sort(auxChar1);
    Arrays.sort(auxChar2);
    isAnagram = Arrays.equals(auxChar1,auxChar2);
    System.out.println("Las palabras " + (isAnagram ? "son anagramas" : " no son anagramas"));
  }
}
