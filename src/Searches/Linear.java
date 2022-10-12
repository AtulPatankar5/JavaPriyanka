package Searches;

class Linear {

	public static int linearsearch(int[]ar, int x)
	{
		for(int i=0;i<ar.length;i++)
		{
			if(x==ar[i])
			{
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] a=  {13,46,73,43,60,80,20,9};
		
		System.out.println(linearsearch(a, 60));
		System.out.println(linearsearch(a, 8));
	}

}
