package java8;

// method ref is replacement of lambda expression for functional interface

interface clll {
	public void abstra();

}

public class MethodReference {
	public void method() {
		System.out.println("this is normal method");
	}
	
	public static void onemethod() {
		System.out.println("this is static method");
	}
	public static void main(String[] args) {
		// to assign normal method to functional interface as method ref we have to create object for that aa
		MethodReference mr=new MethodReference();//created object
		clll c=mr::method;// assigned it to functional interface
		c.abstra();// and called method of functional interface
		
		
		
		clll c1=MethodReference::onemethod;// assigning static method using class name(no need to create object)
		c1.abstra();// and called method of functional interface
		
	}

}
