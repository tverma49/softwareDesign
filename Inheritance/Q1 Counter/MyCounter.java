
public class MyCounter extends Counter 
{
	private int upper_limit;
	public MyCounter(int v, int ul) 
	{
		super(v);
		upper_limit = ul;
	}
	public boolean increment()
	{
		if(value<upper_limit)
		{
			value++;
			return true;
		}
		else
			return false;
	}
	public int readLimit()
	{
		return upper_limit;
		
	}
}
