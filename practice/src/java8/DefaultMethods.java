package java8;

@FunctionalInterface
interface funy {
// default method
	default void method() {
		System.out.println("rajkumar");
	}

// one abstract method
	public String meth();

// static method
	public static void staticmethods() {
		System.out.println("this is static method ");
	}
}

public class DefaultMethods implements funy {

	@Override
	public String meth() {
		return "hello this abstract method";
	}

	public static void main(String[] args) {
		DefaultMethods df = new DefaultMethods();
		System.out.println(df.meth()); // calling implemented abstract method

		df.method(); // calling default method which is implemented inside Functional interface
		// if we want we can use (default methods are optional methods )

		funy.staticmethods();
	}
}
