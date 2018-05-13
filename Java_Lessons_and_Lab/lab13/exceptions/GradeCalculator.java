package exceptions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class GradeCalculator {
	
	Map<String,Integer> minScores = new TreeMap<>(); 
<<<<<<< HEAD
////
	
=======
			
>>>>>>> remotes/OzgurKilic/lab/master
	public GradeCalculator(){
		minScores.put("A", null);
		minScores.put("B", null);
		minScores.put("C", null);
		minScores.put("D", null);
	}
<<<<<<< HEAD
///////
	
=======

>>>>>>> remotes/OzgurKilic/lab/master
	public boolean minimumScoresCompleted() {
		boolean completed = true;
		for (String grade: minScores.keySet()){
			if (minScores.get(grade) == null){
				return false;
			}
		}
		
		return completed;
	}
<<<<<<< HEAD
/////
	
=======

>>>>>>> remotes/OzgurKilic/lab/master
	public String nextGradeWithoutScore() {
		for (String grade: minScores.keySet()){
			if (minScores.get(grade) == null){
				return grade;
			}
		}
		return null;
	}
	
<<<<<<< HEAD
//////error
	
	public void setMinScore(String grade, String minScore) throws InvalidMinimumScoreException {
		try{
		Integer score = Integer.parseInt(minScore);
		
		if(score> 100){
			throw new InvalidMinimumScoreException("Minimum score can not be greater than 100");

		}
			minScores.put(grade, score);

		
		}catch(NumberFormatException ex){
			throw new InvalidMinimumScoreException(minScore+" is not a valid score");
			
		}
	}
	
///////////
	
	
	public void printGrades(String fileName) throws FileNotFoundException  {
=======

	public void setMinScore(String grade, String minScore) throws InvalidMinimumScoreException {
		try{
			Integer score = Integer.parseInt(minScore);
			
			if (score > 100){
				throw new InvalidMinimumScoreException("Minimum score can not be greater than 100");
			}
		
			minScores.put(grade, score);

		}catch(NumberFormatException ex){
			throw new InvalidMinimumScoreException(minScore + " is not a valid score");
		}
		
	}

	public void printGrades(String fileName) throws FileNotFoundException {
>>>>>>> remotes/OzgurKilic/lab/master
		Scanner scanner = new Scanner(new BufferedReader(new FileReader(fileName)));
		while (scanner.hasNextLine()) {
			String line = scanner.nextLine();
			String[] values = line.split("\t", -1);
			Integer score = Integer.parseInt(values[1]);
			String assignedGrade = null;
			for(String grade:minScores.keySet()){
				if (score >= minScores.get(grade)){
					assignedGrade = grade;
					break;
				}
			}
			if (assignedGrade == null){
				assignedGrade = "F";
			}
			System.out.println(values[0] + " " + assignedGrade);
		}
		scanner.close();
	}

	
<<<<<<< HEAD
	/////////////////////
=======
	
>>>>>>> remotes/OzgurKilic/lab/master
}
