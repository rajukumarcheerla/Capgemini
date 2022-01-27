package String;

public class method {
	public static void main(String[] args) {
		String s="HI THIS IS RAJKUMAR";
		
		System.out.println(s.indexOf(9));
		
		byte[] b=s.getBytes();
		for (byte c : b) {
			System.out.print(c+" ");
		}
		System.out.println();
		System.out.println(s.contains("RAJKUMAR"));// IF in side a string it has RAJKUMAR it will give us true or false
		
	}
	public static void main1(String[] args) {
		char[] ch= {'s','a','n','t','h','t'};
		for (char c : ch) {
			System.out.print(c+" ");
		}
		System.out.println();
		
		String ss=new String(ch);
		method(ss);
		
		
		String s="santha";
		String s1="SANTHA";
		System.out.println(s.equals(s1));//false
		System.out.println(s.equalsIgnoreCase(s1));//true
	}
	
public static void method(String str) {
	int count=0;
	for (int i = 0; i < str.length(); i++) {
		if(str.charAt(i)=='t') {
			count++;
			
		}
		
	}
	System.out.println(count);
	
	
	
	}
}




