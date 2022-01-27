package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main1 {
	
	public static void main(String[] args) {
	
		ArrayList<Person> list=new ArrayList<>();
		ArrayList<Person> list2 = list;
		list2.add(new Person(13, "raju", 556663l));
		list2.add(new Person(1, "vara", 556663l));
		list2.add(new Person(31, "kaju", 556663l));
		list2.add(new Person(41, "chemb", 556663l));
		list2.add(new Person(12, "satra", 556663l));
		
		Map<Integer, List<Person>> map=list2.stream().collect(Collectors.groupingBy(Person::getId));
		
		System.out.println(map.toString());
		
		list2.stream().sorted((a,b)->b.compareTo(a)).forEach(s->System.out.println(s));
		System.out.println();
		Optional<Person> pp=list2.stream().min((a,b)->a.compareTo(b));
		System.out.println(pp.get());
				
	}

}
