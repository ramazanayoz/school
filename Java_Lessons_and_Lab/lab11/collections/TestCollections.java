package collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;

public class TestCollections {

	public static void main(String[] args) {
		String values = "23 4 6 12 5 4 16 12 6";
		String[] arr = values.split(" ");

//		// Test List
		Collection<String> col = new ArrayList<>();

		for (String str : arr) {
			col.add(str);
		}

		System.out.println(col);

		col.add("4");

		System.out.println(col);

		// Test HashSet
		Set<String> set = new HashSet<>();

		for (String str : arr) {
			set.add(str);
		}

		System.out.println("HashSet: " + set);

		set.add("15");

		System.out.println("HashSet: " + set);

		// Test LinkedHashSet
		Set<String> linkedSet = new LinkedHashSet<>();

		for (String str : arr) {
			linkedSet.add(str);
		}

		System.out.println("LinkedHashSet: " + linkedSet);

		linkedSet.add("15");

		System.out.println("LinkedHashSet: " + linkedSet);

		// Test TreeSet natural order
		Set<String> treeSet = new TreeSet<>();

		for (String str : arr) {
			treeSet.add(str);
		}

		System.out.println("TreeSet: " + treeSet);

		treeSet.add("15");

		System.out.println("TreeSet: " + treeSet);

		// Test TreeSet with comparator
		Set<String> treeSet2 = new TreeSet<>(new NumberComparator());

		for (String str : arr) {
			treeSet2.add(str);
		}

		System.out.println("TreeSet Comp: " + treeSet2);

		treeSet2.add("15");

		System.out.println("TreeSet  Comp: " + treeSet2);

		// Test Queue
		Queue<String> queue = new LinkedList<>();

		for (String str : arr) {
			queue.add(str);
		}

		System.out.println("Queue: " + queue);

		System.out.println("removed: " + queue.remove());

		System.out.println("Queue: " + queue);

		// Test Priority Queue
		Queue<String> pQueue = new PriorityQueue<>();

		for (String str : arr) {
			pQueue.add(str);
		}

		System.out.println("Priority Queue: " + pQueue);

		System.out.println("removed: " + pQueue.remove());

		System.out.println("Priority Queue: " + pQueue);

		// Test Priority Queue with Comparator
		Queue<String> pCQueue = new PriorityQueue<>(new NumberComparator());

		for (String str : arr) {
			pCQueue.add(str);
		}

		System.out.println("Priority Queue Comp: " + pCQueue);

		System.out.println("removed: " + pCQueue.remove());

		System.out.println("Priority Queue: Comp" + pCQueue);

		// stack
		Queue<String> stack = Collections.asLifoQueue(new LinkedList<String>());

		for (String str : arr) {
			stack.add(str);
		}

		System.out.println("Stack Comp: " + stack);

		System.out.println("removed: " + stack.remove());

		System.out.println("Stack  Comp: " + stack);
	
	}

}
