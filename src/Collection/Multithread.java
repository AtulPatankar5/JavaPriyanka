package Collection;

class Multithread extends Thread
{
	
	public void running()// non-static method
	{
		System.out.println("Thread running....");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Multithread mt= new Multithread();// creating an user defined thread// thread is in new stage  
		mt.start();// runnable stage 
		mt.running();
		
	}

}
