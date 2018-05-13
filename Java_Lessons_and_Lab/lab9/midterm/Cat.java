package midterm;

public class Cat extends Animal {
	
	//String name;

	Cat(String name){
		this.name=name;// bu olmazsa ve yukarda name yazarsa hata alırız çünkü polimorfizm yaptık
	}
	
	@Override
	String speak() {
		// TODO Auto-generated method stub
		return "Meow";
	}

}
