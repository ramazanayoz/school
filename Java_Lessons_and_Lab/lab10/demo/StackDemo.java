package demo;
import java.util.*;
import stack.Stack;
import stack.StackArrayListImpl;
import stack.StackImpl;

public class StackDemo {

	public static void main(String[] args) {
<<<<<<< HEAD
		
		
		StackImpl<Integer> stack = new StackImpl<>();
		stack.push(5);//0.index	eklenir
		stack.push(3);//1.index	eklenir
		stack.push(5);//2.index	eklenir
		//stack.push("D");//3.index eklenir
		stack.push(9);//4.index eklenir
		
		
		StackImpl<Integer> stack2 = new StackImpl<>();
		stack.push(7);//0.index	eklenir
		stack.push(5);//1.index	eklenir
		stack.push(4);//2.index	eklenir
	stack.addAll(stack2);
		
		
		System.out.println(stack.toList()); //tersine döndürür while döndüsü 


		
		int total = 0;
		while (!stack.empty()){
			System.out.println(stack.pop());
		}
			System.out.println(total); //tersine döndürür while döndüsü 
	
	}
	
=======
		Stack<Integer> stack = new StackArrayListImpl<>();
		stack.push(4);
		stack.push(6);
		stack.push(7);
		stack.push(8);
		
		System.out.println(stack.toList());
		
		Stack<Integer> stack2 = new StackImpl<>();
		stack2.push(2);
		stack2.push(5);
		stack2.push(1);
		
		stack.addAll(stack2);
		
		System.out.println(stack.toList());
		
		Stack<Integer> stk = stack;
		
		int total = 0;
		while (!stk.empty()){
			total += stk.pop();
		}
		System.out.println(total);
>>>>>>> remotes/OzgurKilic/lab/master
	}




//string cannot be integer