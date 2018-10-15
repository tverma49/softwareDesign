class Ticket{

       protected int price;
       private String seat;
       private String event;
       

       public Ticket(int p,String s,String e)
       { 
    	   this.price=p;
           seat=s;
           event=e;
       }
       public int readPrice()
       { 
    	   return price;
       } 
       public void setPrice(int p)
       {
    	   price=p;
       }
}
