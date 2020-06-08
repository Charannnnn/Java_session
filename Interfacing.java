import java.io.*; 
  
interface in
{ 
    // public, static and final 
    final int a = 10; 
  
    // public and abstract  
    void display(); 
} 
  
// A class that implements interface. 
class Interfacing implements in
{ 
    // Implementing the capabilities of 
    // interface. 
    public void display() 
    { 
        System.out.println("Interfacing"); 
    } 
  
    // Driver Code 
    public static void main (String[] args) 
    { 
       Interfacing t = new Interfacing(); 
        t.display(); 
        System.out.println(a); 
    } 
} 