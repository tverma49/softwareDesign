
class Base{
     public void f1()
                {System.out.println("f1 base");}	
    public void f2()
                {System.out.println("f2 base");}
}

class Derv extends Base{  	
       public void f1()
                   {System.out.println("f1 derv");}	
       public void f2()
                   {System.out.println("f2 derv");}
}
public class Ex1{

public static void main(String[] args){
		Base[] b=new Base[2];

		b[0]=new Base();
		b[1]=new Derv();

		for(int i=0;i<2;i++)
		            b[i].f1();
	     }
}
