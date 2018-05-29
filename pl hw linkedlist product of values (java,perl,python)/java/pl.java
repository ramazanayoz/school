
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;


public class pl {
	
	 static LinkedList<Integer> linkedlist;
	 static LinkedList<Integer> linkedlist2;

	 
	public static void main(String[] args) {
		
	         linkedlist = new LinkedList<Integer>();
	         linkedlist2 = new LinkedList<Integer>();
	         
	 		readfile("plhw", linkedlist);
			readfile("plhw2", linkedlist2);
			
			
			
			prodcutoflinkedlist(linkedlist, linkedlist2);

			

	
	
	}
	private static void prodcutoflinkedlist(LinkedList<Integer> linkedlist, LinkedList<Integer> linkedlist2) {
		boolean a = true;
		int i =0;
		
		while (a){
			try {
			int result=linkedlist.get(i)*linkedlist2.get(i);
			System.out.println("product is : "+result);
			
			if (linkedlist.equals(null)|| (linkedlist2.equals(null))){
			break;
			}
			++i;
			}
			catch (Exception e) {
				break;
			}

		}
		
	}



	public static  void readfile (String a,LinkedList<Integer> linkedlist ){
	BufferedReader reader;
	try {
		reader = new BufferedReader(new FileReader(
				a));
		String line = reader.readLine();
		while (line != null) {
			
		if(line.matches("[0-9]+")){
			
			int number = Integer.parseInt(line);
			
			linkedlist.add(number);
			
			}
			
			line = reader.readLine();

		}
		reader.close();
	} catch (IOException e) {
		e.printStackTrace();
	}	
	
}
	

}
