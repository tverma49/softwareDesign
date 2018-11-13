

class MyArrayList{
        private Node[] head;
        private int max;
        private int count;
	  public  MyArrayList(int max){
	    	 this.max=max;
	    	 count=0;
	    	 head=new Node[max];}
        public  boolean insert(String s1,int a)
	        {      if (count<max){
	        	        Node temp =new Node(s1,a);
	                    head[count]=temp;
	                    count++;
	                    return true;}
	               else  return false;}	
       public int youngest()
        {     int res=900;
              String name="BLANK";
              for(int i=0;i<count;i++){
      	           Node temp=head[i];
      	           if (temp.readage()<res){
                            name=temp.readname();
      		                res=temp.readage();}
                   }
              return res  ; 
        }                                              

       		public  boolean search(String s1)
	        {     boolean res=false;
	              for(int i=0;i<count;i++)
	              {
	            	  Node temp=head[i];
	            	  if (temp.readname().equals(s1))
	            	  {
	            		  res=true;
	            	  }
	              }
                  return res; 
	         }                                 

       	     public void printlist()
	         {
	               Node temp;
	               System.out.println("\nList:");
	               System.out.print("HEAD->");
	               for(int i=0;i<count;i++) 
	               {
		        	   temp = head[i];
		               temp.print();
		           }
		           System.out.print("NULL");   
		     }
       	     
			public int seachAgeFirst(String name) 
			{
				Node temp;
				for(int i=0;i<count;i++)
	              {
	            	  temp=head[i];
	            	  if (temp.readname().equals(name))
	            	  {
	            		  return temp.readage();	            		  
	            	  }
	              }
				return 0;
			}
			public boolean AllOlderThan(int age) 
			{
				int young = youngest();
				if(young<age)
					return false;
				else
					return true;
			}
			public int oldest() 
			{
				int res=0;
	            for(int i=0;i<count;i++)
	            {
	            	Node temp=head[i];
	      	        if (temp.readage()>res)
	      	        {
	      	        	res=temp.readage();}
	                }
	              return res; 
			}
			
			public String delete_last() {
				String res="";
				Node temp1;
				  for(int i=0;i<count;i++)
				  {
				
					  temp1 = head[i];
					  res  = temp1.readname();
					  temp1 = null;
				  }
				  count--;
				  return res;                                               
		}                                             

}

   