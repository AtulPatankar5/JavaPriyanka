package String;

 class String_buffer2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuffer s= new StringBuffer("Good Morning");
		s.append(" 	guys");
		
		s.delete(1, 3);
		System.out.println(s);
		
	}

}
