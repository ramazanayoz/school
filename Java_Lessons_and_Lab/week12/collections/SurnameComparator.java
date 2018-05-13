package collections;

import java.util.Comparator;

public class SurnameComparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		int result = o1.getSurname().compareTo(o2.getSurname());
		return result == 0 ? o1.getId() - o2.getId() : result; 
	}

}
