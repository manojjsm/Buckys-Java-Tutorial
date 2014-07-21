package bucky;

public class tuna {
	//Multiple Constructor
	private int hour;
	private int minute;
	private int second;
	
	public tuna(){
		this(0,0,0);
	}
	
	public tuna(int h){
		this(h,0,0);
	}
	
	public tuna(int h, int m){
		this(h,m,0);
	}	
	public tuna(int h, int m, int s){
		setTime(h,m,s);
	}
	
	public void setTime(int h, int m, int s)
	{
//		setHour(h);
//		setMinute(m);
//		setSecond(s);
	}
	//Public,Private and This
//	private int hour =1;
//	private int minute =2 ;
//	private int second =3;
//	
//	public void setTime(int hour, int minute, int second){
//		this.hour = ((hour>=0 && hour<24) ? hour : 0);
//		this.minute = ((minute>=0 && minute<60) ? minute : 0);
//		this.second = ((second>=0 && second<60) ? second : 0);
//	}
	//Time Class
//	private int hour;
//	private int minute;
//	private int second;
//	
//	public void setTime(int h, int m, int s){
//		hour = ((h>=0 && h<24) ? h : 0);
//		minute = ((m>=0 && m<60) ? m : 0);
//		second = ((s>=0 && s<60) ? s : 0);
//	}
	
	public String toMilitary()
	{
		return String.format("%02d:%02d:%02d", hour, minute, second);
	}
	
	public String toString(){
		return String.format("%d:%02d:%02d %s",((hour==0 ||hour==12)?12:hour%12),minute,second,(hour<12?"AM":"PM"));
	}
	
	
	//multiple class
//	private String girlName;
//	
//	public tuna(String name){
//		girlName = name;
//	}
//	
//	public void setName(String name){
//		girlName = name;
//	}
//	public String getName(){
//		return girlName;
//	}
//	
//	public void saying(){
//		System.out.printf("Your first gf was %s", getName());
//		
//	}
//	
//	public void simpleMessage(String name){
//		System.out.println("Hello " + name);
//	}
	
//	public void simpleMessage()
//	{
//		System.out.println("This is another class");
//	}
}
