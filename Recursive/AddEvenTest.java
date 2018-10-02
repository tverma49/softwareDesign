
public class AddEvenTest {

	private static int res = 0;
    public static int addEven(int value){
    	if(value<10)
    	{
    		return value;
    	}
    	else
    	{
    		res = value%10 + addEven(value/10);
    		return res;
    	}
    	
    }
    public static void main(String[] args) {
	  int number=Console.readInt("Enter Value:");
          System.out.println("Res= "+ addEven(number));
    }
}

