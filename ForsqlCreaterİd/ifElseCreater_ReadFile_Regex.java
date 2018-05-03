package mysqlDeneme;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

//if else creater from input
public class ifElse {

	public static void main(String[] args) {
		
		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader(
					"/home/r.ayoz15/Desktop/notdouble.txt"));
			String line = reader.readLine();
			int i= 1;
			while (line != null) {
				System.out.println("if (line.contentEquals"+"(\""+line+ "\")){ ");
				System.out.println("System.out.println(\""+i+"\");}");
				

				line = reader.readLine();
				i++;
			}
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}	
		
	}

}
	

