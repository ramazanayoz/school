package collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class TestSet {

	public static void main(String[] args) {
		Set<String> set = new TreeSet<>(new StringComparator());// Text in String

		String text = "Have a good day. Have a good class. " 
		+ "Have a good visit. Have fun!";

		// Extract words from text
		StringTokenizer st = new StringTokenizer(text, " .!?");
		while (st.hasMoreTokens()){
			set.add(st.nextToken());
		}
		System.out.println(set);
	
	}
}