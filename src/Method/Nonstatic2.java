package Method;

class Nonstatic2 {

	public void search()
	{
		syntax();
		System.out.println("search tab"); 
	}
	public void temple() {
		
		run();
		System.out.println("temple tab");
	}
	
	public void run() {
		search();
		System.out.println("run tab");
	}
	
	public void syntax() {
		
		System.out.println("sysntax tab");
	}
	
	public void clear() {
		temple();
		System.out.println("clear tab");
	}
	
	public static void main(String[] args) {
		
		Nonstatic2 nw= new Nonstatic2();
		nw.clear();
		
	}

}
