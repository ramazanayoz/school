package exceptions;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class TestGradeCalculator {

<<<<<<< HEAD
	public static void main(String[] args)  {
=======
	public static void main(String[] args) {
>>>>>>> remotes/OzgurKilic/lab/master
		
		GradeCalculator calc = new GradeCalculator();
		Scanner scanner = new Scanner(System.in);
		
		
		//Request minimum scores for grades
		while (!calc.minimumScoresCompleted()){
			String grade = calc.nextGradeWithoutScore();
			System.out.println("Enter minimum score for " + grade + ":");
			
			String minScore = scanner.nextLine();
			try {
				calc.setMinScore(grade,minScore);
			} catch (InvalidMinimumScoreException e) {
				System.out.println(e.getMessage());
			}
		}
<<<<<<< HEAD
		//Error
		///////
	
		

		String fileName = null;// vermezsek initiliza error verir null or "" buda kullanılabilir
		
		while(true){
		try {
			System.out.print("Enter input file:");
			 fileName = scanner.nextLine();
			calc.printGrades(fileName);
			break;
		} catch (FileNotFoundException e) {
			System.out.println("Can not find file "+ fileName);
		}
		}
=======
		
	
		
		String fileName = null;
		
		while(true){
			try {
				System.out.print("Enter input file:");
				fileName = scanner.nextLine();
				calc.printGrades(fileName);
				break;
			} catch (FileNotFoundException e) {
				System.out.println("Can not find file " + fileName);
			}
		}
		
>>>>>>> remotes/OzgurKilic/lab/master
		scanner.close();

	}

}
<<<<<<< HEAD


//haftaya exceptions and collection quiz
=======
>>>>>>> remotes/OzgurKilic/lab/master
