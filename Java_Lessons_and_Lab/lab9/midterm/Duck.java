package midterm;

public class Duck extends Animal {
	
	//String name;

	Duck(String name){
		this.name=name;// bu olmazsa ve yukarda name yazarsa hata alırız çünkü polimorfizm yaptık
	}
	
	@Override
	String speak() {
		// TODO Auto-generated method stub
		return "Quack";
	}

}
