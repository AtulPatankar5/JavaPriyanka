package OOPS;

class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dell d= new Dell("HP","black",8,25000);
		d.laptopDetails();
		d.Delldetials();
		Laptop l= new Laptop("HP","black",8);
		//l.Delldetials();
		l.laptopDetails();
				
	}
}
	class Laptop
	{
	
		String brand;
		String color;
		int ram;
		Laptop(String brand, String color, int ram)
		{
			this.brand=brand;
			this.color=color;
			this.ram=ram;
		}
		public void laptopDetails()
		{
			System.out.println("the brand ="+brand);
			System.out.println("the color="+color);
			System.out.println("Ram="+ram);
		}
	}
	class Dell extends Laptop
	{
		long price;
		Dell(String brand, String color, int ram, long price){
			super( brand, color, ram);
			this.price=price;
		}
		public void Delldetials()
		{
			System.out.println("the brand ="+brand);
			System.out.println("the color="+color);
			System.out.println("Ram="+ram);
			System.out.println("price="+price);
		}
	}

