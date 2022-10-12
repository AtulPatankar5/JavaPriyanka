package Searches;

class bubble_sorting {

	public static void sort(int []a)
	{
		int n= a.length;
				
		for( int i=0; i<n-1;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
	}
	public static void main(String[] args) {
	
		int[] a= {5,1,6,9,7,2};
		sort(a);
		
		for(int x:a)
		{
			System.out.print(x);
		}
		
	}

}
