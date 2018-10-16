
public class Rectangle extends Shape {

	int length;
	
	public Rectangle(int w, int l) {
		super(w);
		length = l;
		
	}
	public int calculateArea()
	{
		return width*length;
	}

}
