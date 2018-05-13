package stack; //data scructure

<<<<<<< HEAD
import java.util.*;

public interface Stack<T> {// soyut gibi gövde olmaz

	public void push(T item);// index ekleme
	public T pop ();
	public boolean empty();
	
	public List<T> toList();
	public void addAll(Stack<T> aStack);


=======
import java.util.List;

public interface Stack<T> {

	public void push(T item);
	
	public T pop ();
	
	public boolean empty();
	
	public List<T> toList();
	
	public void addAll(Stack<? extends T> aStack);
>>>>>>> remotes/OzgurKilic/lab/master
}
