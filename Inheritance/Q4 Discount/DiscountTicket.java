
public class DiscountTicket extends Ticket {

	int disc;
	public DiscountTicket(int p, String s, String e, int d) 
	{
		super(p, s, e);
		disc = d;
	}
	
	public void setDiscount(int d)
	{
		disc = d;
	}
	public int grossPrice()
	{
		return price-disc;
	}

}
