
public class AddEvenTest {


    public static int addEven(int value){
    	if(value<10 && value%2==0)
    	{
    		return value;
    	}
    	else
    	{
	    	int sum=0;
	    	int last = value%10;
	    	int rest = value/10;
	    	if(last%2==0)
	    	{
	    		sum = last + addEven(rest);
	    		return sum;
	    	}
	    	else
	    		return sum+addEven(rest);    		
    	}
    }
    public static void main(String[] args) {
    	
	  int number=Console.readInt("Enter Value:");
	  System.out.println("Res= "+ addEven(number));
	  
    }
}

