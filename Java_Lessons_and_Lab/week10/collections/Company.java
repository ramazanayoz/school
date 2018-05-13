package collections;

public class Company {
	private String name;

	public Company(String name) {
		super();
		this.name = name;
	}
	
	
	public boolean equals(Object obj){
		if(obj == null){
			return false;
		}
		if (obj instanceof Company){
			Company comp = (Company)obj;
			return name.equals(comp.name);
		}
		return false;
	}

	
	public String toString(){
		return name;
	}
}
