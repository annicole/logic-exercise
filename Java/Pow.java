/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interview;

/**
 *
 * @author ANA.ROSAS
 */
public class Pow {

  public static void main(String[] args) {
    double res= Mypow2(2.0, 2);
    System.out.println("Resultado: " + res);
  }

  public static double myPow(double x, int n) {
    double resul = 0.0;
    int cont = 0;
    try {
      int aux = Math.abs(n);
      while (cont < aux) {
        resul = resul + (x * cont);
      }
      if (n > 0) {
        resul = 1 / resul;
      }
    }
    catch (Exception e) {
      System.out.println(e);
    }
    return resul;
  }

  public static double Mypow2(double x, int n) {
    if (n == 0) {
      return 1;                     //2^0=1
    }
    if (n == Integer.MIN_VALUE) //when n is Integer.MIN_VALUE
    {
      x = x * x;
      n /= 2;
    }
    if (n < 0) //if n is negative make x=1/x and will make n positive 
    {
      n = -n;
      x = 1 / x;
    }
    if (n % 2 == 0) {
      return myPow(x * x, n / 2);      //for n is even   like 2^4   ((2*2)^2)
    }
    else {
      return myPow(x * x, n / 2) * x;
    }
  }
}
