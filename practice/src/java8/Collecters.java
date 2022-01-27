package java8;

import java.util.ArrayList;
import java.util.stream.Collectors;

import collections.Emp;

public class Collecters {
	public static void main(String[] args) {
		Emp emp = new Emp(8, "raju", "raju@gmail.com");
		Emp emp1 = new Emp(8, "raju", "raju@gmail.com");
		Emp emp2 = new Emp(3, "santha", "santha@gmail.com");
		Emp emp3 = new Emp(4, "ramu", "ramu@gmail.com");

		ArrayList<Emp> list = new ArrayList<Emp>();
		list.add(emp);
		list.add(emp1);
		list.add(emp2);
		list.add(emp3);

		Double collect = list.stream().collect(Collectors.averagingInt(a -> a.getId()));
		System.out.println("average" + collect);

		Double collect1 = list.stream().collect(Collectors.summingDouble(s -> s.getId()));
		System.out.println(collect1);
		
		Long collect2 = list.stream().collect(Collectors.counting());
		System.err.println(collect2);
	}

}
