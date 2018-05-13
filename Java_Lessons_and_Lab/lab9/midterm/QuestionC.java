package midterm;

public class QuestionC {
int a;
public static void main(String[] args) {
QuestionC c= new QuestionC();
c.a = 5;
int a = 10;
increment(c, a);
System.out.println("c.a = " + c.a + ", a = " + a);
} 
public static void increment(QuestionC c, int a){
c.a++;
a++;
}
}
