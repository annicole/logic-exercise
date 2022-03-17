/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interview.RegEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author ANA.ROSAS
 */
public class EjemploExp {

  public static void main(String[] args) {
    replaceAll();
    System.out.println(Pattern.matches("[amn]", "abcd"));//false (not a or m or n)  
    System.out.println(Pattern.matches("[amn]", "a"));//true (among a or m or n)  
    System.out.println(Pattern.matches("[amn]", "ammmna"));//false (m and a comes more than once)  

    System.out.println("? quantifier ....");
    System.out.println(Pattern.matches("[amn]?", "a"));//true (a or m or n comes one time)  
    System.out.println(Pattern.matches("[amn]?", "aaa"));//false (a comes more than one time)  
    System.out.println(Pattern.matches("[amn]?", "aammmnn"));//false (a m and n comes more than one time)  
    System.out.println(Pattern.matches("[amn]?", "aazzta"));//false (a comes more than one time)  
    System.out.println(Pattern.matches("[amn]?", "am"));//false (a or m or n must come one time)  

    System.out.println("+ quantifier ....");
    System.out.println(Pattern.matches("[amn]+", "a"));//true (a or m or n once or more times)  
    System.out.println(Pattern.matches("[amn]+", "aaa"));//true (a comes more than one time)  
    System.out.println(Pattern.matches("[amn]+", "aammmnn"));//true (a or m or n comes more than once)  
    System.out.println(Pattern.matches("[amn]+", "aazzta"));//false (z and t are not matching pattern)  

    System.out.println("* quantifier ....");
    System.out.println(Pattern.matches("[amn]*", "ammmna"));//true (a or m or n may come zero or more times)  
  }

  //sustituye todas las apariciones que concuerden con el patron "a*b" por la cadena "-".
  public static void replaceAll() {
    Pattern patron = Pattern.compile("a*b");
    Matcher encaja = patron.matcher("aabmanoloaabmanoloabmanolob");
    String resultado = encaja.replaceAll("-");
    System.out.println(resultado);
  }

  /* ejemplo trata de validar una cadena que supuestamente contiene un email, lo hace con
cuatro comprobaciones, con un patrón cada una, la primera que no contenga como primer
caracter una @ o un punto, la segunda que no comience por www. , que contenga 
una y solo una @ y la cuarta que no contenga caracteres ilegales*/
  public static void validateString() {
    String input = "www.?regular.com";
    //comprueba que no empiece por punto o @
    Pattern p = Pattern.compile("^.|^@");
    Matcher m = p.matcher(input);
    if (m.find()) {
      System.out.println("Error, no debe empezar con . o @");
    }
    //Comprueba que no empiece con www
    p = Pattern.compile("^www.");
    m = p.matcher(input);
    if (m.find()) {
      System.out.println("Error, no debe empezar con www");
    }
    //Comprueba que tenga @
    p = Pattern.compile("@");
    m = p.matcher(input);
    if (!m.find()) {
      System.out.println("Error, el correo no contiene @");
    }

    //Comprueba que no tenga caracteres prohibidos
    p = Pattern.compile("[^A-Za-z0-9.@_-~#]+");
    m = p.matcher(input);
    StringBuffer sb = new StringBuffer();
    boolean resultado = m.find();
    boolean caracteresIlegales = false;

    while (resultado) {
      caracteresIlegales = true;
      m.appendReplacement(sb, "");
      resultado = m.find();
    }
    m.appendTail(sb);
    input = sb.toString();
    if (caracteresIlegales) {
      System.out.println("La cadena contiene caracteres ilegales");
    }
  }

  public static void methaCharcters() {
    System.out.println("metacharacters d....");//d means digit System
    System.out.println(Pattern.matches("\\d", "abc"));//false (non-digit)  
    System.out.println(Pattern.matches("\\d", "1"));//true (digit and comes once)  
    System.out.println(Pattern.matches("\\d", "4443"));//false (digit but comes more than once)  
    System.out.println(Pattern.matches("\\d", "323abc"));//false (digit and char)  

    System.out.println("metacharacters D....");// D means non - digit  

    System.out.println(Pattern.matches("\\D", "abc"));//false (non-digit but comes more than once)  
    System.out.println(Pattern.matches("\\D", "1"));//false (digit)  
    System.out.println(Pattern.matches("\\D", "4443"));//false (digit)  
    System.out.println(Pattern.matches("\\D", "323abc"));//false (digit and char)  
    System.out.println(Pattern.matches("\\D", "m"));//true (non-digit and comes once)  

    System.out.println("metacharacters D with quantifier....");
    System.out.println(Pattern.matches("\\D*", "mak"));//true (non-digit and may come 0 or more times)  
  }

  public static void examples() {

    /*Create a regular expression that accepts alphanumeric characters only.  
Its length must be six characters long only.*/
    System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "arun32"));//true  
    System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "kkvarun32"));//false (more than 6 char)  
    System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "JA2Uk2"));//true  
    System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "arun$2"));//false ($ is not matched)  

    /*Create a regular expression that accepts 10 digit numeric characters 
 starting with 7, 8 or 9 only.*/
    System.out.println("by character classes and quantifiers ...");
    System.out.println(Pattern.matches("[789]{1}[0-9]{9}", "9953038949"));//true  
    System.out.println(Pattern.matches("[789][0-9]{9}", "9953038949"));//true  

    System.out.println(Pattern.matches("[789][0-9]{9}", "99530389490"));//false (11 characters)  
    System.out.println(Pattern.matches("[789][0-9]{9}", "6953038949"));//false (starts from 6)  
    System.out.println(Pattern.matches("[789][0-9]{9}", "8853038949"));//true  

    System.out.println("by metacharacters ...");
    System.out.println(Pattern.matches("[789]{1}\\d{9}", "8853038949"));//true  
    System.out.println(Pattern.matches("[789]{1}\\d{9}", "3853038949"));//false (starts from 3)  
  }
}
