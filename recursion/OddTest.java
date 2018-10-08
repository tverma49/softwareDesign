
public class OddTest {

    public static int countOdd(int value)
    {
    	if(value<10)
    	{
    		if(value%2!=0)
    			return 1;
    		else
    			return 0;
    	}
    	else
    	{
	    	int count=0;
	    	int last = value%10;
	    	int rest = value/10;
	    	if(last%2!=0)
	    	{
	    		count = 1 + countOdd(rest);
	    		return count;
	    	}
	    	else 
	    	{
	    		return count+countOdd(rest);  
	    	}  		
    	}
    }
    public static void main(String[] args) 
    {
    	int number=Console.readInt("Enter Value:");
    	System.out.println("Res= "+ countOdd(number));
    }
}

