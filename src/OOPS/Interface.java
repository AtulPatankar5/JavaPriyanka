package OOPS;

interface If1
{
static String name="atul";
abstract public void apple();  
public static void run()
{
	System.out.println(" hi hello from run");
}
}
interface If2
{
	abstract public void apple();
}


class Interface implements If1, If2
{

	public void apple() {
		System.out.println(" hi helo from Apple");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		If1 a= new Interface();
		a.apple();
		Interface it= (Interface)a;
		//it.run();
		System.out.println(it.name);
		
		If2 a2= new Interface();
		a.apple();
		
	}
	

}
