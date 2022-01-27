package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.function.Predicate;

public class Mai {
	public static void main(String[] args) {
		Emp emp = new Emp(8, "raju", "raju@gmail.com");
		Emp emp1 = new Emp(2, "shiva", "shiva@gmail.com");
		Emp emp2 = new Emp(3, "santha", "santha@gmail.com");
		Emp emp3 = new Emp(4, "ramu", "ramu@gmail.com");

		ArrayList<Emp> list = new ArrayList<>();
		list.add(emp);
		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
		LinkedList<Emp> ll = new LinkedList<>();
		ll.add(emp);
		ll.add(emp1);
		ll.add(emp2);
		ll.add(emp3);
		HashSet<Emp> hs = new HashSet<>();
		hs.add(emp);
		hs.add(emp1);// allows null values
		hs.add(emp2);
		hs.add(emp3);
		TreeSet<Emp> ts = new TreeSet<>();
		ts.add(emp);
		ts.add(emp1);
		ts.add(emp2);// not allow null values
		ts.add(emp3);

		HashMap<Emp, Integer> hm = new HashMap<>();
		hm.put(emp3, 1);
		hm.put(emp, 1);// maintains no order
		hm.put(emp1, 1);
		hm.put(emp2, 1);

		LinkedHashMap<Emp, Integer> lhm = new LinkedHashMap<>();
		lhm.put(emp3, 1);
		lhm.put(emp, 1);// maintains insertion order
		lhm.put(emp1, 1);
		lhm.put(emp2, 1);

		TreeMap<Emp, Integer> tm = new TreeMap<>();
		tm.put(emp3, 1);
		tm.put(emp, 1);
		tm.put(emp1, 1);// maintain acceding order
		tm.put(emp2, 1);

		Set<Emp> keySet = lhm.keySet();
		Set<Entry<Emp, Integer>> entrySet = lhm.entrySet();
		for (Entry<Emp, Integer> entry : entrySet) {
			System.out.println(entry);
		}

//list.forEach(a->System.out.println(a));	
//list.stream().sorted((a,b)->a.getName().compareTo(b.getName())).forEach(a->System.out.println(a));

	}
}