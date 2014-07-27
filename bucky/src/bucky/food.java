package bucky;

abstract public class food {
	//58 Abstract and Concrete class
//	concrete class - you can make object of it.
//	food fo = tuna();
//	abstract method must be overriden
//	when class have an abstract method, class should abstract as well
	public abstract void eat();
	
	
	//57-Overiding Rules
	//everytime you overide a method you need to have the same argument
	//should have the same access modifier
	//overloaded have the same name but have a different argument
	//overiding and overloading is a different thing
	//abstract - can only be inherited but you cannot create an object of it.
	
	//55 intro to polymorphism
//	void eat(){
//		System.out.println("This food is great");
//	}
//	
	
	//49-Inheritance
	//subclass - the on who inherent
	//superclass - the one where they inherit
//	public void eat(){
//		System.out.println("I am the eat methods");
//	}
		
}
