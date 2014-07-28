package bucky;

public class DogList {
	//59-Class to hold objects
	private Dog[] thelist = new Dog[5];
	private int i=0;
	
	public void add(Dog d){
		if(i<thelist.length){
			thelist[i]= d;
			System.out.println("Dog added at index "+ i);
			i++;
		}
		
	}
}
