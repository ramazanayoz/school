
public class AClass {
	
	public static int aMethod(int aVariable){
		return (--aVariable <= 0) ? 1 : (aVariable * aMethod(aVariable)) ;
	}

	public static void main(String[] args) {
		String str1 = "abc";
		String str2 = "abc";
		if (str1.equals(str2)){
			
		}
		
		
		System.out.println(aMethod(5)); //>> OUTPUT : 24
		System.out.println(aMethod(4)); //>> OUTPUT : 6
		System.out.println(aMethod(3)); //>> OUTPUT : 2
	}

}
