package com.duobelt.mw;

public class RunnableTest {
	    public static void main(String[] args) {
	      
	      System.out.println("=== RunnableTest ===");
	     
	     // Anonymous Runnable
	     Runnable r1 = new Runnable(){
      
	       @Override
	       public void run(){
        System.out.println("Hello world one!");
       }
	     };
	     
// W oczekiwaniu na lamba 
	  // W oczekiwaniu na lamba 
	    // Lambda Runnable
// Runnable r2 = () -> System.out.println("Hello world two!");
	     
     // Run em!
	     r1.run();
//r2.run();
	     
	   }
	}