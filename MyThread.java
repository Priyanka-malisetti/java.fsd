package Thread;

public class MyThread extends Thread {
	
	
	 	public void run()
	 	{
	  		System.out.println("Welcome to Simplilearn..");
	}
	 	public static void main( String args[] )
	 	{
	  		MyThread mt = new  MyThread();
	  		mt.start();
	 	}
	}




