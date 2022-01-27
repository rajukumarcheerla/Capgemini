package methodOverLoading;

// same method name but parameters should be differant and return type can be same or diff

public class MOL {

	public int method(int a) {
		return a + 10;

	}

	public String method(String s) {
		return "hi rajukumar";

	}

	public void method(int a, int b) {
		System.out.println(a * b);

	}

}

