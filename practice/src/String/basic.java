package String;

import java.util.Scanner;

public class basic {
	
	public void basic(String str) {
		if(str.equals("a")&&str.equals("e")&& str.equals("i") && str.equals("o") && str.equals("u")) {
			System.out.println("it is ovel");
		}else {
			System.out.println("it is not ovel");
		}
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter char");
		String str=sc.nextLine();
		
		basic b =new basic();
		b.basic(str);
	}

}
