package OOPS;

class Abstraction extends xyz
{
	// method overrriding 
	public void mango() {
		System.out.println(" I am yellow ");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		xyz x= new Abstraction(); 
		x.mango();
		x.apple();
		x.pineapple();
		
		//xyz xy= new xyz(); // CTE becoz we cannot create an object for the abstract class 
	}

}
abstract class xyz
{
	public  void apple() {
		System.out.println("Hello from apple");
	}
	public static void pineapple() {
		System.out.println("heelo from pinepapple");
	}
	abstract public void mango();
}
