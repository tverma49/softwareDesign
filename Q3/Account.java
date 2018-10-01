
public class Account {

	private String name;
	private int number;
	private int transactions;
	private Money balance;
	
	public Account(String n, int no)
	{
		name = n;
		number = no;
		transactions = 0;
		balance = new Money(0,0);
	}
	
	public int read_transactions() {
		// TODO Auto-generated method stub
		return transactions;
	}

	public String read_bal() {
		// TODO Auto-generated method stub
		return balance.read_value();
	}

	public String read_name()
	{
		return name;
	}
	public void deposit(int e1, int c1) {
		// TODO Auto-generated method stub
		balance.add(e1,  c1);	
		transactions++;
	}

	public boolean withdraw(int e1, int c1) {
		// TODO Auto-generated method stub
		int b = c1 + (e1 *100);
		if(balance.total_in_cent()>=b)
				{
					transactions++;
					
				}
		return balance.sub(e1, c1);
		
	}
}
