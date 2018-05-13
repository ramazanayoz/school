package week6;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		ArrayList<String> strings = new ArrayList<>();
		
		strings.add("Hello");
		
		System.out.println(strings.size());
		
		strings.add("world");
		
		ArrayList<String> strings2 = new ArrayList<>();
		
		strings2.add("Ozgur");
	
		strings2.addAll(strings);
		
		System.out.println(strings2);
		
		ArrayList<Integer> integers = new ArrayList<>();

		Integer a = new Integer(7);
		integers.add(a);
		integers.add(6);
		integers.add(5);
		
		System.out.println(integers);
		
		integers.set(0, 10);
		
		integers.remove(1);

		System.out.println(integers);
		
		integers.add(0, 8);
		
		System.out.println(integers);
	}

}
