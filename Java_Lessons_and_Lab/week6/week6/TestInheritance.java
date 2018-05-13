package week6;

public class TestInheritance {

	public static void main(String[] args) {
		Student st = new Student();
		st.name = "Ali";
		st.age = 18;
		st.gpa = 2.90;

		System.out.println(st.toString());
		
		Professor pf = new Professor();
		
		pf.name = "Mehmet";
		pf.age = 32;
		pf.papers.add(new Paper("Something"));
		pf.isAlive = true;
		
		
		Box box  = new Box(5,6,7);
		
		box.setDimension(6, 5, 10);
		
		System.out.println(box.area());
		
		System.out.println(box);
		
		Rectangle rect = new Rectangle(5,6);
		
		System.out.println(rect.area());
		
	}

}
