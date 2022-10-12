package String;

 class String_buffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuffer s1= new StringBuffer("hello");
		StringBuffer s2= new StringBuffer("hello");
		
		System.out.println(s1==s2);// compare reference
		System.out.println(s1.equals(s2));// compare attributes
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s1.hashCode()==s2.hashCode()); // compare hashcode values
		
	}

}
