package java8;

// with out lambda expression we can use anonymous class to implement Functional interface

interface functionClass{
	public String oneAb(int a);
}

public class WithOutLambda {
public static void main(String[] args) {
	functionClass f=new functionClass() {
		@Override
		public String oneAb(int a) {
			return "hi rajKumar";
		}
		
	};
	System.out.println(f.oneAb(4));
}	

}
