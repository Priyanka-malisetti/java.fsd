package example;
import java.util.*;

public class QueueExample {

	public static void main(String[] args) {
		Queue<String> locationsQueue = new LinkedList<>();
		locationsQueue.add("Hyderabad");
		        		locationsQueue.add("Banglore");
		        		locationsQueue.add("Chennai");
		        		locationsQueue.add("Delhi");
		        		locationsQueue.add("Noida");
		System.out.println("Queue is : " + locationsQueue);
		        		System.out.println("Head of Queue : " + locationsQueue.peek());
		        		locationsQueue.remove();
		        		System.out.println("After removing Head of Queue : " + locationsQueue);
		        		System.out.println("Size of Queue : " + locationsQueue.size());
		    	}


	

}


