/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interview;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author ANA.ROSAS
 */
public class DuplicateCharacters {

  public static void main(String[] args) {
    duplicate();
  }

  public static void duplicate() {
    String cadena, aux;
    HashMap<Character, Integer> map = new HashMap<Character, Integer>();
    System.out.println("Enter the string:");
    Scanner sc = new Scanner(System.in);
    cadena = sc.nextLine();
    if (!cadena.equals("")) {
      for (char c: cadena.toCharArray()) {
        if (!map.containsKey(c)) {
          map.put(c, 1);
        }
        else {
          map.put(c, map.get(c) + 1);
        }
      }
      Set<Character> charsInString = map.keySet();

      for (char s: charsInString) {
        if (map.get(s) >= 1) {
          System.out.println(s + ": " + map.get(s));
        }
      }

    }
  }

}
