package OOPS;

class Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Adharcard as= new Adharcard("OMkar",45,234324);;
		System.out.println(as.getname());
		as.setname("Atul");
		System.out.println(as.getname());
	}
	
}

	
class Adharcard
{
	
	
	private String name;
	private int age;
	private long adharno;
	long cno;
	 Adharcard(String name,int age, long adharno) 
	 {
		 this.name= name;
		 this.age=age;
		 this.adharno=adharno;
	 }
	 
	public String getname()
	{
		return name;
	}
	public void setname(String name)
	{
		this.name=name;
	}
	public int getage()
	{
		return age;
	}
	public void setage(int age)
	{
		this.age=age;
	}
	public long getadharno()
	{
		return adharno;
		
	}
	public void setadharno(long adharno)
	{
		this.adharno=adharno;
	}
}

