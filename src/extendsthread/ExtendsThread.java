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
public class ExtendsThread extends Thread{

    int threadNumber;

    public ExtendsThread(int num) {
        threadNumber = num;
    }
    
    public void run(){
        System.out.println("i'm thread number: " + threadNumber );
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            System.out.println(threadNumber + " is finished");
        }
        System.out.println(threadNumber + " is finished");
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Creating thread 1");
        
        Thread t1 = new ExtendsThread(1);
        
        System.out.println("Creating thread 2");
        Thread t2 = new ExtendsThread(2);
        
        //start both thread
        t1.start();
        t2.start();
    }
    
}
