package Method;

class recursionsolution2 {

	public static void print (int a )
	{
		System.out.println(a);
		a--;
		
		if(a==0)
		{
			return;
		}
		print (a);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=10;
		print(a);
	}

}
