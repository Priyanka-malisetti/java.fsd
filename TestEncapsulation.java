package name;
public class TestEncapsulation
{ 
    private String Name; 
    private int Roll; 
    private int Age;
    public int getAge1()  
    { 
      return Age; 
    } 
    public String getName1()  
    { 
      return Name; 
    } 
    public int getRoll1()  
    { 
       return Roll; 
    } 
    public void setAge1( int newAge) 
    { 
      Age = newAge; 
    } 
    public void setName1(String newName)
    { 
        Name = newName; 
      } 
      public void setRoll1( int newRoll)  
      { 
        Roll = newRoll; 
      } 

  
          
      public static void main (String[] args)  
      {
    	  TestEncapsulation obj = new TestEncapsulation(); 
          obj.setName1("Harsh"); 
          obj.setAge1(19); 
          obj.setRoll1(51); 
          System.out.println("My name: " + obj.getName1()); 
          System.out.println("My age: " + obj.getAge1()); 
          System.out.println("My roll: " + obj.getRoll1());      

      }

	private String getRoll() {
		
		return null;
	}

	private String getAge() {
		
		return null;
	}

	private String getName() {
		
		return null;
	}

	private void setRoll(int i) {
		
		
	}

	private void setAge(int i) {
	
		
	}

	private void setName(String string) {
		
		
	}





    

}
