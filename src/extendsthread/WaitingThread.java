/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extendsthread;

/**
 *
 * @author luthf
 */
public class WaitingThread extends Thread{
    
    public void run(){
        System.out.println("This thread feels a little ill....");
        // Sleep for five seconds
        try{
            Thread.sleep(500);
        }catch(InterruptedException e){
        }
    }
    
    public static void main(String[] args) throws InterruptedException{
        // Create and start dying thread
        Thread dying = new WaitingThread();
        dying.start();
        
        // prompt user and wait for input
        System.out.println("Waiting for thread death");
        
        // wait till death
        dying.join();
        System.out.println("thread has died");
        
    }
}
