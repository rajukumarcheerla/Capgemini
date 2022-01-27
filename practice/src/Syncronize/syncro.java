package Syncronize;

public class syncro {
	
	public void method() {
		System.out.println("this is non- syncronized method");
	}
	synchronized public void method1() {
		System.out.println("this is syncronized method");
	}
	public static void main(String[] args) {
		syncro s=new syncro();
		s.method();
		s.method1();
		
	}

}
