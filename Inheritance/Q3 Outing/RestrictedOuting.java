
public class RestrictedOuting extends Outing {

	private int max;
	public RestrictedOuting(int count, int m) 
	{
		super(count);
		max = m;
	}
	public boolean add()
	{
		if(count<max)
		{
			count++;
			return true;
		}
		else 
			return false;
	}
	public int check_avail_places()
	{
		return max-count;
	}
	int readCount()
	{
		return count;
	}
	public int print_details()
	{
		System.out.println(max-count);
		return max-count;
	}

}
