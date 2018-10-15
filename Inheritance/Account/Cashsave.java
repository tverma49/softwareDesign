
public class Cashsave extends Account {

	private int max;
	public Cashsave(int n, int b, int m) 
	{
		super(n, b);
		max = m;	
	}
	public boolean deposit(int amt)
	{
		int b = balance+amt;
		if(b>max)
		{
			return false;
		}
		else
		{	
			balance+=amt;		
			return true;
		}
	}

}
