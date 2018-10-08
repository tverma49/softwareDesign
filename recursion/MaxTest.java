
public class MaxTest {

	static int temp=0;
    public static int max(int value)
    {
    	if(value<10)
		{
    		return value;
    		
//			if(value>temp)
//			{
//				temp=value;
//				return temp;
//			}
//			else 
//				return temp;    		
		}
		else
		{
			int last = value%10;
	    	int rest = value/10;
	    	
	    	if(last>max(rest))
	    		return last;
	    	else
	    		return max(rest);
	    	
//	    	if(last>temp)
//	    	{
//	    		temp = last;
//	    		max(rest);
//	    		return temp;
//	    	}
//	    	else 
//	    	{
//	    		max(rest);
//	    		return temp;
//	    	}  		    	
		}    	
    }
    public static void main(String[] args) {
	  int number=Console.readInt("Enter Value:");
          System.out.println("Res= "+ max(number));
    }
}

