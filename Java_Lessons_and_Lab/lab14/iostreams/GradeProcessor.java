package iostreams;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class GradeProcessor {

	public static void main(String[] args) {
		GradeProcessor gp = new GradeProcessor();
		String fileName = "lab14/HWGrades.txt";
		try {
			gp.processFile(fileName);
		} catch (FileNotFoundException e) {
			System.out.println(fileName + " does not exist");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void processFile(String fileName) throws IOException {
		
		//FileInputStream reader = new FileInputStream(fileName);

		BufferedReader reader = new BufferedReader(new FileReader(fileName));
		FileWriter writer = new FileWriter("lab14/out.txt");
		
		String line = reader.readLine();
		int count = 0;
		while (line != null){
			count++;
			if (count > 1){
				String[] items = line.split("\t");
				int total = 0;
				for (int i = 1; i< items.length; i++){
					total += Integer.parseInt(items[i]);
				}
				double avg = (double)total / (items.length - 1);
				System.out.println(items[0] + "\t" + avg);
				writer.write(items[0] + "\t" + avg + "\n");
			}
			
			line = reader.readLine();
		}
		System.out.println("Number of lines :" + count);
		
		reader.close();
		writer.close();
	}

}
