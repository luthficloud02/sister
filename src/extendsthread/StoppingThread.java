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
public class StoppingThread extends Thread {
    
    public void run(){
        int count = 1;
        System.out.println("I can cound. Watch me go!");
        for(;;){
            // Print cound and increment it 
            System.out.print( count++ + " ");
            // Sleep for half a second
            try{
                Thread.sleep(500);
            }catch(InterruptedException e){
                
            }
        }
    }
    
    public static void main(String[] args) throws IOException{
        // create and start counting thread
        Thread counter = new StoppingThread();
        counter.start();
        // Prompt user and wait for input
        System.out.println("Press any enter to stop the thread counting");
        System.in.read();
        
        // Interrupt the thread
        counter.stop();
    }
}
