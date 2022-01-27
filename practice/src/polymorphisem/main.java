package polymorphisem;

import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter obj name");
		String str=sc.nextLine();
		somthimng s=new somthimng();
		animal a=s.obj(str);
		a.eat();
	
	
	
}
	

}
class somthimng{
public animal obj(String str) {	
		
		if(str.equals("dog")) {
			return new dog();
		}else if (str.equals("cat")) {
			return new cat();
		}else {
			return null;
		}
	}

}
