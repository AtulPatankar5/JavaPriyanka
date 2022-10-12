package Method;

class NonStatic {

	public void crash()
	{
		System.out.println("hi this is crash");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		NonStatic ns= new NonStatic();
		ns.crash();
	}

}
