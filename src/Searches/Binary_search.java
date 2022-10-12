package Searches;



class Binary_search {

	public static int binarysearch(int[]ar, int x)
	{
		int first= 0;
		int last=ar.length-1;
		while(first<=1)
		{
			int mid=(first+last)/2;
			if(x==ar[mid])
			{
				return mid;
			}
			else if (x>ar[mid])
			{
				first=mid+1; 	// ascending 
					
			}
			else 
			{
				last=mid-1;		// descending
			}
		}
		return -1;
	}
	public static void main(String[] args) {

		int[] i	= {5,8,21,33,46};
		System.out.println(binarysearch(i,33));
		
		
	}

}
