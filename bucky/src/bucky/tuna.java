package bucky;

public class tuna {
	
	private String girlName;
	
	public tuna(String name){
		girlName = name;
	}
	
	public void setName(String name){
		girlName = name;
	}
	public String getName(){
		return girlName;
	}
	
	public void saying(){
		System.out.printf("Your first gf was %s", getName());
		
	}
	
	public void simpleMessage(String name){
		System.out.println("Hello " + name);
	}
	
//	public void simpleMessage()
//	{
//		System.out.println("This is another class");
//	}
}
