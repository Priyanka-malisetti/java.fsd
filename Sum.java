package object;

public class Sum 
{
     public int sum(int a, int b) 
    { 
        return (a + b); 
    } 
    public int sum(int a, int b, int c) 
    { 
       
		return (a + b + c); 
    } 
    public double sum(double a, double b) 
    { 
        return (a + b); 
    } 
    public static void main(String args[]) {
    Sum s = new Sum(); 
    System.out.println(s.sum(50, 60)); 
    System.out.println(s.sum(50, 60, 70)); 
    System.out.println(s.sum(50.5, 60.5)); 
} 


}
    



