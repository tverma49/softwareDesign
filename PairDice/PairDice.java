
public class PairDice {

	Die die1;
	Die die2;
	
	
	public PairDice(int a, int b)
	{
		die1 = new Die(1);
		die2 = new Die(2);
	}
	
	public void rollDice()
	{
		die1.roll();
		die2.roll();
	}
	
	public int sumDiceValues()
	{
		return die1.getValue() + die2.getValue();
	}
	
	public boolean valuesEqual()
	{
		if(die1.getValue() == die2.getValue())
			return true;
		else
			return false;
	}
	
	public int readValue1()
	{
		return die1.getValue();
	}

	public int readValue2() {
		return die2.getValue();
	}
}
