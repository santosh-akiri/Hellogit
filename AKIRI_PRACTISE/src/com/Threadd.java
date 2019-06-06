package com;

public class Threadd implements Runnable {
	public  void run(){ 
		Thread t1=new Thread();
		System.out.println("thread is running...and Gitbash addeddd");  

		for(int i=0;i<1000;i++){
			System.out.println(i);
			
		}
		}  
	
	
		  
		public static void main(String args[]){  
			Threadd m1=new Threadd();  
		Thread t1 =new Thread(m1);  
		Thread t2 =new Thread(m1);
		t1.start();
		t2.start();
		 } 
}
