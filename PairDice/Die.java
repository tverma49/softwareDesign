
public class Die {

	private int value; 
	Die(int a)
	{
		value = a;
	}
	
	public void roll()
	{
		double res = Math.random();
		value = 1+ (int)(res*1000)%6;
	}
	
	public int getValue()
	{
		return value;
	}
	public static void main(String[] args) {
		

	}

}
