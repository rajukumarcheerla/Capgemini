package java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class comparater {
	public static void main(String[] args) {
		Comparator<String> com=new Comparator<String>() {
			
			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);
			}
		};
		
		List<String> list=Arrays.asList("*","***","**","****");
		
		list.stream().sorted((a,b)->b.compareTo(a)).forEach(a->System.out.println(a));

	}

}
