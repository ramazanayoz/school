package stack;
import java.util.*;

<<<<<<< HEAD
=======
import java.util.ArrayList;
import java.util.List;
>>>>>>> remotes/OzgurKilic/lab/master

public class StackImpl<T> implements Stack<T> {

	StackItem<T> top = null;
	
	@Override
	public void push(T item) {
<<<<<<< HEAD
		StackItem<T> newTop = new StackItem<>( item);
=======
		StackItem<T> newTop = new StackItem<T>(item);
>>>>>>> remotes/OzgurKilic/lab/master
		newTop.setNext(top);
		top = newTop;
	}

	@Override
	public T pop() {
		T item = top.getItem();
		top = top.getNext();
		return item;
	}

	@Override
	public boolean empty() {
		return (top == null);
	}

<<<<<<< HEAD
	public List<T> toList(){
	List<T> list = new ArrayList<>();
	StackItem<T> current = top;
	while(current!=null){
		list.add(current.getItem());
		current = current.getNext();
	
	
	}
	return list;

	}
	public void addAll(Stack<T> aStack){
		for(int i = aStack.toList().size() -1;i>=0;i++){
			push(aStack.toList().get(i));
			
=======
	@Override
	public List<T> toList() {
		List<T> lst = new ArrayList<>();
		StackItem<T> current = top;
		while(current!=null){
			lst.add(current.getItem());
			current = current.getNext();
		}
		
		return lst;
	}

	@Override
	public void addAll(Stack<? extends T> aStack) {
		for(int i = aStack.toList().size()-1; i>=0; i--){
			push(aStack.toList().get(i));
>>>>>>> remotes/OzgurKilic/lab/master
		}
		
	}
	
}
