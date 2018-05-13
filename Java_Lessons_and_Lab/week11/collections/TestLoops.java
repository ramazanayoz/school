package collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class TestLoops {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(5);
		list.add(7);
		list.add(11);
		list.add(12);
		list.add(21);

		List<Integer> list2 = new ArrayList<>(list);
		System.out.println("list2: " + list2);
		
/*		for (int i = 0; i < list.size(); i++) {
			Integer element = list.get(i);
			// delete numbers between 10 and 20
			if ((element >= 10) && (element < 20)) {
				list.remove(element);
			}
		}
		
		System.out.println(list);
*/		
		
//		for (int element : list) {
//			// delete numbers between 10 and 20
//			//if ((element >= 10) && (element < 20)) {
//			//	list.remove(element);
//			//}
//			list.remove(0);
//		}		
//		
//		System.out.println(list);
		
		
		Iterator<Integer> itr = list.iterator();
		while(itr.hasNext()){
			Integer a = itr.next();
			if ((a >= 10) && (a < 20)) {
				itr.remove();
			}
		}
		System.out.println(list);
		
		
		System.out.println(list2.containsAll(list));
		System.out.println(list.containsAll(list2));
		
		list2.addAll(list);
		System.out.println("list2: " + list2);
		
		
		//list2.removeAll(list);
		list2.retainAll(list);
		System.out.println("list2: " + list2);
		
		list2.add(null);
		list2.add(null);	
		list2.add(null);
		System.out.println("list2: " + list2);
		
		list2.remove(null);
		System.out.println("list2: " + list2);

		List<Integer> nullList = new ArrayList<>();
		nullList.add(null);
		list2.removeAll(nullList);
		System.out.println("list2: " + list2);
		
		System.out.println();
		Integer[] items = list2.toArray(new Integer[0]);
		for(Object item: items){
			System.out.print(item + " ");
		}
		
		
		Set<Integer> set = new HashSet<>(list2);
		System.out.println("set: " + set);
		
		System.out.println(list2.indexOf(21));
		
	}

}
