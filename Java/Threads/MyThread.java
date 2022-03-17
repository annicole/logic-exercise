/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interview.Threads;

/**
 *
 * @author ANA.ROSAS
 */
public class MyThread extends Thread{
  
  @Override
  public void run(){
    for (int i = 0; i < 5; i++) {
        System.out.println(Thread.currentThread().getName() + " in control");
    }
  }
}
