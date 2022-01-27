package methodOverLoading;

public class main {
		public static void main(String[] args) {
			MOL m = new MOL();
			int a = m.method(1);
			System.out.println(a);
			String s = m.method("r");
			System.out.println(s);
			m.method(1, 0);
		}
	
}
