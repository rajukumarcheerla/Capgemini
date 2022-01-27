package java8;

//lambda expression can implemented with functional interfaces

interface funClass {
	public String oneAbstract(String name);
}

interface funClass1 {
	public int One1(int a, int b);
}

public class LamdaExpression {
	public static void main(String[] args) {

		funClass f = (a) -> {
			return "hello " + a;
		};
		System.out.println(f.oneAbstract("raju"));

		funClass1 f1 = (a, b) -> {
			return (a * b);
		};
		System.out.println(f1.One1(40, 80));

	}

}
