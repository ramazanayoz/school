package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MapTest {

	public static void main(String[] args) {

		Map<String,List<Integer>> map = new TreeMap<>();
		
		String text  = "The root interface in the collection hierarchy. "
				+ "A collection represents a group of objects, "
				+ "known as its elements. "
				+ "Some collections allow duplicate"
				+ " elements and others do not. Some are ordered and "
				+ "others unordered. The JDK does not provide any "
				+ "direct implementations of this interface: it provides "
				+ "implementations of more specific subinterfaces like "
				+ "Set and List. This interface is typically used to "
				+ "pass collections around and manipulate them where "
				+ "maximum generality is desired.";
		
		
		 Pattern p = Pattern.compile("\\b\\w+\\b");
		 Matcher m = p.matcher(text);

		 int count = 0;
		 while(m.find()){
			 String word = m.group();
			 List<Integer> positions = map.get(word);
			 if(positions == null){
				 List<Integer> pos = new ArrayList<>();
				 pos.add(count);
				 map.put(word, pos);
			 }else{
				 positions.add(count);
				 //map.put(word, ++count);
			 }
			 count++;
		 }
		 
		 for(String word: map.keySet()){
			 System.out.println(word + "=" + map.get(word));
		 }
	}

}
