package drawing;

public class Text implements Drawable, Comparable {
	private String text;

	public Text(String text) {
		this.text = text;
	}

	public void draw() { 
		System.out.println("Drawing text " + text );
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
