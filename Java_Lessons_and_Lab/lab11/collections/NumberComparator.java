package collections;

import java.util.Comparator;

public class NumberComparator implements Comparator<String> {
<<<<<<< HEAD
	public int compare(String o1,String o2){
		Integer int1 = Integer.parseInt(o1);
		Integer int2 = Integer.parseInt(o2);
		return int1-int2;

	}
	
	
=======

	@Override
	public int compare(String o1, String o2) {
		Integer int1 = Integer.parseInt(o1);
		Integer int2 = Integer.parseInt(o2);
		return int1 - int2;
	}
>>>>>>> remotes/OzgurKilic/lab/master

}
