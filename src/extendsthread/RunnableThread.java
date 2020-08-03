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
public class RunnableThread implements Runnable{

    @Override
    public void run() {
        System.out.println("I am an instance of the java.lang.Runnable interface");
    }
    
    public static void main(String[] args) {
        System.out.println("Creating runnable object");
        
        Runnable run = (Runnable) new RunnableThread();
        
        
        //create a thread, and pass the runnable objecet
        System.out.println("Createing first thread");
        Thread t1 = new Thread(run);
        
        // create a second thread, and pass the runnable object
        System.out.println("Creating second thread");
        Thread t2 = new Thread(run);
        
        //start both threads
        System.out.println("Starting both threads");
        t1.start();
        t2.start();
        
        
    }

    
    
    
}
