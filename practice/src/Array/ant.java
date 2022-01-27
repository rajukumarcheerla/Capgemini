package Array;

import java.util.Iterator;
import java.util.Scanner;

public class ant {
	public static void main1(String[] args) {
		int[] a= {1,2,3,4,45};
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
	//minimum in array
	public static void main2(String[] args) {
		int[] r= {6,5,4,3,2};
		int min=r[0];
		for (int i=0;i<r.length; i++) {
			if(min>r[i]) {//(min<r[i])for max
				min=r[i];
			}
		}
		System.out.println(min);
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter any number");
		int a=sc.nextInt();
		
		int[] r= {6,5,4,3,2};
		for (int i=0;i<r.length; i++) {
			if(r[i]==a) {
				System.out.println("num is there in array");
				break;
			}else {
				System.out.println("num is not there in array");
				break;
			}
		}
	}

}
