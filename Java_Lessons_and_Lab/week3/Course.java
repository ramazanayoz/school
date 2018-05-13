
public class Course {

	public static void main(String[] args) {
		Student[] students = new Student[4];
		
		Student st1 = new Student();
		st1.name = "Ali";
		//st1.year = 2016;
		st1.id = "10001010";
		students[0] = st1;
		st1.age = 18;
		System.out.println(st1.age);
		st1.incrementAge();
		
		
		Student st2 = new Student();
		st2.name = "Veli";
		st2.year = 2015;

		System.out.println(st1.age);	
		System.out.println(st2.age);	
	}

}
