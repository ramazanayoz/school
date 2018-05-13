package collections;

import java.util.Comparator;
import java.util.Map.Entry;

public class EntryComparator implements Comparator<Entry<Student, Integer>> {

	@Override
	public int compare(Entry<Student, Integer> o1, Entry<Student, Integer> o2) {
		int result = o1.getValue() - o2.getValue();
		return result == 0 ? o1.getKey().getId() - o2.getKey().getId() : result;
	}

}
