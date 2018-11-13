import java.util.Scanner;

public class TestLList{

    public static void main(String[] args){

       MyArrayList l=new MyArrayList(9);
       Scanner sc = new Scanner(System.in);

		String name;
		int age;

		int choice=0;
		while (choice!=10)
		{
			System.out.println();
	    	System.out.println("Menu:");
			System.out.println("1: Insert");
			System.out.println("2: Delete Last");
			System.out.println("3: Print_list");
            System.out.println("4: search Age");
            System.out.println("5: get Age of First person with name entered");
            System.out.println("6: Age of oldest");
			System.out.println("7: Is Everone Older than given Age");
			System.out.println("9: Initialize");
			System.out.println("10: Exit \n");
			System.out.print("\nPlease enter a value-->");
			choice=sc.nextInt();
			switch(choice)
			{
			    case 1:
						System.out.print("Enter Name:");
						name=sc.next();
						System.out.print("Enter Age:");
						age=sc.nextInt();
						l.insert(name,age);
						break;
			    case 2:
			          	String d=l.delete_last();
			          	System.out.println(d+" deleted");
			          	break;
	
			    case 3:   
			    		l.printlist();
				        break;
	
			    case 4:
						System.out.print("Enter Name:");
						name=sc.next();
						boolean res1=l.search(name);
	                    System.out.println("Found= "+res1);
	                    break;
	
			    case 5:
						System.out.print("Enter Name:");
						name=sc.next();
			            int res2=l.seachAgeFirst(name);
	                    if(res2==0)          
	                    	System.out.println("Person not found");
	                    else
	                    	System.out.println("Age = "+res2);
						break;
	
	            case 6:
	            		System.out.println("Max Age == "+l.oldest());
				       	break;
	            case 7:
						System.out.print("Enter Age:");
						age=sc.nextInt();
						System.out.println("All Older than "+ age+" : "+l.AllOlderThan(age));
						break;
				case 9:  
	                      l.insert("A",5);
			              l.insert("B",15);
			              l.insert("C",4);
			              l.insert("D",8);
	                      l.insert("B",25);
	                      l.insert("B",20);
	                      break;     
				default:
			}
		}
    }    
}