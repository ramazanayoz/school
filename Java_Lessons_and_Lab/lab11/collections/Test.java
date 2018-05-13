package collections;

import java.util.*;

public class Test {

	public static void main(String[] args) {
		String values ="23 4 6 12 5 4 16 12 6";
		String[] arr =values.split(" ");
		///////////////////////////////// naıl kullanılcağını oracle siteinden bakıyoruz
	Collection<String> col = new ArrayList<>();

	
	for (String str: arr){
		col.add(str);
	}
		System.out.println(col);
		
		col.add("4");
		System.out.println(col);

//////////////////////////////////		
		Set<String> set = new HashSet<>();
		
		for (String str: arr){
			set.add(str);
		}

		System.out.println("HashSet :"+set);
		set.add("15");
		System.out.println("HashSet :"+set);

	//////////////////////
		Set<String> linkedSet = new LinkedHashSet<>();
		
		for (String str: arr){
			linkedSet.add(str);
		}
		System.out.println("LinkedHashSet :"+linkedSet);

		linkedSet.add("15");


		System.out.println("LinkedHashSet :"+linkedSet);
		//////////////////

		
		Set<String> treeset = new TreeSet<>();
		
		for (String str: arr){
			treeset.add(str);
			
		}
		System.out.println("TreeSet :"+treeset);

		treeset.add("15");
		
		System.out.println("TreeSet :"+treeset);
		
		
		
		///////////////////////////////////////
Set<String> treeset2 = new TreeSet<>(new NumberComparator());
		
		for (String str: arr){
			treeset2.add(str);
			
		}
		System.out.println("TreeSet Comp: "+treeset2);

		treeset2.add("15");
		
		System.out.println("TreeSet Comp: "+treeset2);

		
/////////////////////////////////
Queue<String> queue = new LinkedList<>();
		
		for (String str: arr){
			queue.add(str);
			
		}
		System.out.println("Queue: "+queue);
		
		
		System.out.println("removed: "+queue.remove());


		System.out.println("Queue: "+queue);

		
/////////////////////////////////
		
Queue<String> pqueue = new PriorityQueue<>();
		
		for (String str: arr){
			pqueue.add(str);
			
		}
		System.out.println("Priority Queue: "+pqueue);
		
		
		System.out.println("removed: "+pqueue.remove());


		System.out.println("Priority Queue: "+pqueue);
		
		///////////////////////////////////////////////
		
		
Queue<String> pqcueue = new PriorityQueue<>(new NumberComparator());
		
		for (String str: arr){
			pqcueue.add(str);
			
		}
		System.out.println("Priority Queue Comp: "+pqcueue);
		
		
		System.out.println("removed: "+pqcueue.remove());


		System.out.println("Priority Queue Comp: "+pqcueue);
		
		///////////////////////////////////////////////////////////
		Queue <String> stack = Collections.asLifoQueue(new LinkedList<String>());

		
		for (String str: arr){
			stack.add(str);
			
		}
		System.out.println("Stack  Comp: "+stack);
		
		
		System.out.println("removed: "+stack.remove());


		System.out.println("Stack  Comp: "+stack);
		
	}

}
