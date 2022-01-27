package java8;

import java.util.Arrays;
import java.util.List;

public class Lists {
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(23,44,45,6,7);
		List<Integer> list1=Arrays.asList(23,44,45,6,7);
		List<Integer> list2=Arrays.asList(23,44,45,6,7);
		List<Integer> list3=Arrays.asList(23,44,45,6,7);
		
		List<List<Integer>> ll=Arrays.asList(list,list1,list2,list3);
		
		for (List<Integer> list4 : ll) {
			//System.out.println(list4.toString());
			list4.forEach(s->System.out.print(s+" "));
			System.out.println(list4.size());
			
			
		}
		
		
	}

}
