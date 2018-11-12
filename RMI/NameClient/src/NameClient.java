import java.rmi.Naming;
import java.util.Scanner;

public class NameClient {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    String url =  "rmi:///";
	    try {
	     //String url= "rmi://192.168.23.101/";      // if object located remotely
	     Name n = ( Name) Naming.lookup( url + "toaster" );
	     int choice = 1;
		
		while(choice!=3)
		{
			System.out.println();
			 System.out.println("1.Change Surname");
			 System.out.println("2.Print_Name");
			 System.out.println("3.Exit");	
			System.out.print("\nPlease enter a value-->");
			choice=sc.nextInt();
			 if(choice==1)
			{
				 System.out.print("\nEnter new surname-->");
				 String nm=sc.next();
				 n.updateSurname(nm);
			}
			else if(choice==2)
			{
				String res=n.readName();
				System.out.println(res);
			}

		}  // end while
        }
        catch(Exception e)
        { System.out.println("Error "+e);}
		
	}

	}