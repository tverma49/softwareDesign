	class Outing
	{
		protected int count;
		public Outing(int count)
		{
			this.count = count;
			}

		public boolean cancel()
		{ if (count>0)
		{
			this.count--;
			return true;
		}
		  else
		    return false;
		}
		public int print_details()
		{
////			System.out.println();
////			System.out.println("Outing Details:");
////			System.out.println("Number on Outing: "+count);
		return count;
	}
}