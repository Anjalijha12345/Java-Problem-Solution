// Java Program to implement 
// abstract method 
import java.io.*; 
// Abstract class 
abstract class Fruits { 
	abstract void run(); 
} 
// Driver Class 
class Apple extends Fruits { 
	void run() 
	{ 
		System.out.println("Abstract class example"); 
	} 
	// main method 
	public static void main(String args[]) 
	{ 
		Fruits obj = new Apple(); 
		obj.run(); 
	} 
}
