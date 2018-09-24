package testGUI1;

public class Counter {
	private int value;
	public Counter(int v)
	{
		value = v;
	}
	public int readValue()
	{
		return value;
	}
	public void stepUp()
	{
		value++;
	}
	public void stepDown()
	{
		value--;
	}

}
