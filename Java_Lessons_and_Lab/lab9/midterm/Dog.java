package midterm;

public class Dog extends Animal {
	
	//String name;
	Dog(String name){
		this.name=name; // bu olmazsa ve yukarda name yazarsa hata alırız çünkü polimorfizm yaptık
	}
	
	@Override
	String speak() {
		// TODO Auto-generated method stub
		return "Woof";
	}

}
