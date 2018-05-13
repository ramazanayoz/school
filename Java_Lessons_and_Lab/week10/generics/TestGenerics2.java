package generics;

import java.util.ArrayList;

import stack.Stack;
import stack.StackImpl;

public class TestGenerics2 {

	public static void main(String[] args) {
		Integer i = new Integer(5);

		Number n = i;
		
		Box<String> bi = new Box<>();
		bi.set("");
		
		//Box<Number> bn = bi; error
		
		//boxTest(bi); //error
		
		Node<Integer> nodeI = new Node<>();
		
		//bi = nodeI;
		
		
		
		//Node<Integer> nodeI2  = (Node<Integer>) bi;
		
		

		System.out.println("Sucessful");
		
		
		Object obj = new String("");
		
		Integer i2 = (Integer)obj;
		
		
		ArrayList<Integer> listInt = new ArrayList<>();
		//ArrayList<Object> listobj = listInt; //error
		
		
		Stack<String> strings = new StackImpl<>();
		
		strings.push("a");
		strings.push("b");
		
		Stack<Object> objs = new StackImpl<>();
		
		objs.addAll(strings);
		
		
		
		
	}
	
	public static void boxTest(Box<Number> n) { 
		
		System.out.println(n.get());
	}
	
	
	

}
