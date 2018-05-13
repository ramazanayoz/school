package collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		Collection<String> col = new ArrayList<>();
		String a1 = new String("A");
		col.add(a1);

		List<String> lst = (List<String>) col;

		lst.add(0, "B");

		String a2 = new String("A");
		if (lst.contains(a2)) {
			System.out.println("Yes");
		}

		List<String> lst2 = new ArrayList<>();
		lst2.add("A");
		// lst2.add("C");

		System.out.println("Contains all " + lst.containsAll(lst2));

		Collection<Company> comps = new ArrayList<>();

		Company comp1 = new Company("ABC");

		comps.add(comp1);

		Company comp2 = new Company("ABC");

		if (comps.contains(comp2)) {
			System.out.println("ABC exists");
		}

		System.out.println((comp1 == comp2));
		System.out.println(comp1.equals(comp2));

		comps.remove(comp2);

		System.out.println(comps);

		int i = 6;

		Integer a = i;

		int b = a;

		List<Integer> ints = new LinkedList<>();

		
		ints.add(1);
		ints.add(2);
		ints.add(3);
		ints.remove(new Integer(2));
		
		System.out.println(ints);
		
		Iterator<Integer> itr = ints.iterator();
		while(itr.hasNext()){
			Integer c = itr.next();
			System.out.println(c);
		}
				
	}

}
