package Threads;

public class  create extends Thread {
	@Override
	public void run() {
		for(int i=0;i<20;i++) {
			System.out.println("this is thread");
		}
	}
	public void m1() {
		for(int i=0;i<10 ;i++) {
			System.out.println("NORMAL METHOD");
		}
	}
	
		
	
	public static void main(String[] args) {
	create cr=new create();
	cr.start();
	cr.m1();
	}

}
