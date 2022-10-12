package OOPS;

class Upcasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vegetable v1= new Potato("Brown","Potato",30,1);// upcasting 
		System.out.println(v1.color);
		//v1.PotatoDetails();
		
		Potato p1= (Potato) v1;// Down casting 
		p1.PotatoDetails();
		
		
		Vegetable v2= new Tomato("red", "tomato", 20);
		System.out.println(v2.color);
		
		Tomato t1= (Tomato)v2;// Down casting
		t1.TomatoDetails();
	}

}
class Vegetable
{
	String color;
	String type;
	double price;
	Vegetable(String color, String type,double price)
	{
		this.color=color;
		this.type=type;
		this.price=price;
	}
}
class Potato extends Vegetable
{
	double  weight;
	Potato(String color, String type,double price, double weight)
	{
		super(color, type,price);
		this.weight=weight;
		
	}
	public void PotatoDetails()
	{
		System.out.println("weight="+weight);
		System.out.println("color="+color);
		System.out.println("type="+type);
		System.out.println("price="+price);
	}
}
class Tomato extends Vegetable
{
	Tomato(String color, String type,double price)
	{
		super(color, type,price);
	}
	public void TomatoDetails()
	{
		System.out.println("color="+color);
		System.out.println("type="+type);
		System.out.println("price="+price);
	}
}
