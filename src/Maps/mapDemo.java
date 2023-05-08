package Maps;
import java.util.HashMap;
import java.util.Map;
import java.util.Hashtable;
import java.util.TreeMap;
public class mapDemo {
	public static void main(String[] args) {
		// map
		
				//Hashmap
				HashMap<Integer,String> a1=new HashMap<Integer,String>();      
			      a1.put(1,"priyanka");    
			      a1.put(2,"rajitha");    
			      a1.put(3,"mounika");  
			      System.out.println("\nThe elements of Hashmap are ");  
			      for(Map.Entry m:a1.entrySet()){    
			       System.out.println(m.getKey()+" "+m.getValue());    
			      }
			      
			     //HashTable
			       
			      Hashtable<Integer,String> b1=new Hashtable<Integer,String>();  
			      
			      b1.put(4,"Elsa");  
			      b1.put(5,"Frozen");  
			      b1.put(6,"Jim"); 
			      b1.put(7,"John");  

			      System.out.println("\nThe elements of HashTable are ");  
			      for(Map.Entry n:b1.entrySet()){    
			       System.out.println(n.getKey()+" "+n.getValue());    
			      }
			      
			      
			      //TreeMap
			      
			      TreeMap<Integer,String> map=new TreeMap<Integer,String>();    
			      map.put(8,"Annie");    
			      map.put(9,"Carlotte");  
			      map.put(10,"Catie");       
			      
			      System.out.println("\nThe elements of TreeMap are ");  
			      for(Map.Entry l:map.entrySet()){    
			       System.out.println(l.getKey()+" "+l.getValue());    
			      }    




	}

}
