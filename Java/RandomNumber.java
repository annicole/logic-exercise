/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interview;

import java.util.Random;

/**
 *
 * @author ANA.ROSAS
 */
public class RandomNumber {

  public static void main(String[] args) {
    generateRandom1();
  }

  public static void generateRandom1() {
    Random random = new Random();

    System.out.println("Random integers: " + random.nextInt());
    System.out.println("Random doubles: " + random.nextDouble());
    System.out.println("Random boolean: " + random.nextBoolean());
    System.out.println("Math Random :" + Math.random());
    //0 -50
    System.out.println("Random integers: " + random.nextInt(50));
  }
}
