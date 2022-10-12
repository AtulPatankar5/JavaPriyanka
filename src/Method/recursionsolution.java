package Method;

class recursionsolution {

	public static void print (int a )
	{
		System.out.println(a);
		a++;
		
		if(a==11)
		{
			return;
		}
		print (a);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=1;
		print(a);
	}

}
