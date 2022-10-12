package String;

class Comparing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1;
		s1="hello";
		String s2;
		s2=new String("hello");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1==s2);	// comparing the reference
		System.out.println(s1.equals(s2));	// comparing the attributes
		System.out.println(s2.hashCode());
		System.out.println(s1.hashCode());
		System.out.println(s1.hashCode()==s2.hashCode());//comparing the hashcodes value
	}

}
