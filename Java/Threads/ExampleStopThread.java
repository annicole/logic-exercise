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
public class ExampleStopThread extends Thread {
    private volatile boolean flag = true;
    
    public void stopRunning(){
      flag = false;
    }
    
    @Override
    public void run(){
        while(flag){
          System.out.println("Thread running .....");
        }
        System.out.println("Thread stopped");
    }
    
 /*   public class MainClass 
{   
    public static void main(String[] args) 
    {
        MyThread thread = new MyThread();
         
        thread.start();
         
        try
        {
            Thread.sleep(100);
        } 
        catch (InterruptedException e) 
        {
            e.printStackTrace();
        }
         
        //call stopRunning() method whenever you want to stop a thread
         
        thread.stopRunning();
    }   
}*/
}


