/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extendsthread;

import java.io.IOException;

/**
 *
 * @author luthf
 */
public class InterruptingThread extends Thread {
    
    public void run(){
        System.out.println("I feel sleepy wake me in eight hours");
        try{
            // Sleep for eight hours
            Thread.sleep(100 * 60 * 60 * 8);
            System.out.println("That was a nice nap");
        }catch(InterruptedException e){
            System.out.println("Just five more minutes....");
        }
    }
    
    
    public static void main(String[] args) throws IOException{
        // create a 'sleepy' thread
        Thread sleepy = new InterruptingThread();
        
        //start thread sleeping
        sleepy.start();
        //prompt user and wait fot input
        System.out.println("Press enter to interrupt the thread");
        System.in.read();
        
        // InterruptingThread the thread
        sleepy.interrupt();
    }
}
