package collections;

import java.util.Comparator;

public class NameComparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		int result = o1.getName().compareTo(o2.getName());
		return result == 0 ? o1.getId() - o2.getId() : result; 
	}

}
