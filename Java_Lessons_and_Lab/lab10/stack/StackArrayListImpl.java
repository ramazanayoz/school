package stack;
import java.util.*;
import java.util.ArrayList;
import java.util.List;

<<<<<<< HEAD

public class StackArrayListImpl<T> implements Stack<T> {

	ArrayList<T> stack = new ArrayList<T>();
	
	
	@Override
	public void push(T item) {
		stack.add(0, item); //0.index eklenir dizine
=======
public class StackArrayListImpl<T> implements Stack<T> {

	ArrayList<T> stack = new ArrayList<T>();
	
	@Override
	public void push(T item) {
		stack.add(0, item);
>>>>>>> remotes/OzgurKilic/lab/master
	}

	@Override
	public T pop() {		
<<<<<<< HEAD
		return stack.remove(0);//index silinir ve sağa kayar
=======
		return stack.remove(0);
>>>>>>> remotes/OzgurKilic/lab/master
	}

	@Override
	public boolean empty() {
		return stack.isEmpty();
	}
	
	public List<T> toList(){
	return stack;
	}

	@Override
<<<<<<< HEAD
	public void addAll(Stack<T> aStack) {
=======
	public List<T> toList() {
		
		return stack;
	}

	@Override
	public void addAll(Stack<? extends T> aStack) {
		stack.addAll(0, aStack.toList());
>>>>>>> remotes/OzgurKilic/lab/master
		
	}
}
