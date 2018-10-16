class Shape
{
    protected int width;
    public Shape(int w) { width = w; }
	public int calculateArea() {			
		return 2;
	}        
}

public class ShapeAreaPoly
{
  public static void main(String[] args)
  {
     Shape []s = new Shape[3];
     s[0] = new Square(5);
     s[1] = new Rectangle(2, 4);
     s[2] = new Shape(6);
     for (int i = 0; i < 3; i++)
     {
         System.out.println("Area of shape "+(i+1)+" :" +  s[i].calculateArea());
     }
  }
}


