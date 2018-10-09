

class LinkedList{
        private Node head;
        
	    public  LinkedList(){head=null;}

		public  void insert(String s1,int a)
	        {      Node temp =new Node(s1,a);
			       temp.next=head;
			       head=temp;}


		public  void insert_last(String s1,int a)
	        {	
			 	Node temp =new Node(s1,a);
			 	Node temp2 = head;
			 	while(temp2.next!=null)
			 	{
			 		temp2 = temp2.next;
			 	}
			 	temp2.next = temp;
			 	temp.next = null;
	        }
		


		public  boolean search(String s1)
        {     
			Node temp = head;
			while(temp!=null)
			{
				String s2 = temp.readname();
				if(s1.equals(s2))
				{
					return true;
				}
				temp = temp.next;
			}			
			return false; 
		}


		public  int count(String s1)
	        {     
				Node temp = head;
				int count=0;
				while(temp!=null)
				{
					String s2 = temp.readname();
					if(s1.equals(s2))
					{
						count++;
					}
					temp = temp.next;
				}
				return count; 	        
	        }


		public String delete_first()
		{        
			if (head==null)
				return null;
			
			String res=head.readname();
            head = head.next;
            return res;
		}
		
		
		public String delete_last() {
			Node temp1 =head;
		 	Node temp2 = head.next;
		 	while(temp2.next!=null)
		 	{
		 		temp1 = temp1.next;
		 		temp2 = temp2.next;		 		
		 	}
		 	String res  = temp2.readname();
		 	temp1.next = null;
			return res;
		}	



	     public void printlist()
	     {
	           Node temp=head;
	           System.out.println("\nList:");
	           System.out.print("HEAD->");
	           while(temp!=null) 
	           {
	               temp.print();
	               temp=temp.next;
	           }	               
	            System.out.print("NULL");  			               
		 }

		
   }
