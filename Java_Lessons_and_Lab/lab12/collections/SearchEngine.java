package collections;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

<<<<<<< HEAD


=======
>>>>>>> remotes/OzgurKilic/lab/master
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class SearchEngine {
<<<<<<< HEAD
	Map <String,Set<String>> map = new HashMap<>();

	public void index(String string) throws IOException {
		  /* URL oracle = new URL(string);
	        BufferedReader in = new BufferedReader(
	        new InputStreamReader(oracle.openStream()));

	        String inputLine;
	        while ((inputLine = in.readLine()) != null)
	            System.out.println(inputLine);
	        in.close();	*/	
		Document doc = Jsoup.connect(string).get();

=======

	Map<String,Set<String>> map = new HashMap<>();
	
	public void index(String string) throws IOException {
/*		URL oracle = new URL(string);
		BufferedReader in = new BufferedReader(new InputStreamReader(oracle.openStream()));

		String inputLine;
		while ((inputLine = in.readLine()) != null)
			System.out.println(inputLine);
		in.close();
*/
		Document doc = Jsoup.connect(string).get();
	
>>>>>>> remotes/OzgurKilic/lab/master
		String content = doc.text();
		
		System.out.println(content);
		
		Pattern p = Pattern.compile("\\b\\w+\\b");
<<<<<<< HEAD
		
		Matcher m =p.matcher(content);
		
		while (m.find()) {
=======
		Matcher m = p.matcher(content);
		while(m.find()){
>>>>>>> remotes/OzgurKilic/lab/master
			String word = m.group();
			System.out.println(word);
			Set<String> urls = map.get(word.toLowerCase());
			if(urls == null){
				urls = new HashSet<String>();
				urls.add(string);
<<<<<<< HEAD
				map.put(word.toLowerCase(), urls); 
			}else{
				urls.add(string);
				
			}
			
		}
	}	
	
	
	
	public Set<String> search(String input) {
Set<String> result = map.get(input.toLowerCase());
return result!=null ? result : new HashSet<String>();
//return null;
		

	}
	public void print(){
		for(String key :map.keySet()){
			System.out.println(key + " = " + map.get(key));		
			}
	}



}
=======
				map.put(word.toLowerCase(), urls);
			}else{
				urls.add(string);
			}
			
		}
	}

	public Set<String> search(String input) {
		Set<String> result = map.get(input.toLowerCase());
		return result!=null ? result : new HashSet<String>();
//		return null;
	}

	public void print(){
		for(String key: map.keySet()){
			System.out.println(key + " = " + map.get(key));
		}
	}
	
}




>>>>>>> remotes/OzgurKilic/lab/master
