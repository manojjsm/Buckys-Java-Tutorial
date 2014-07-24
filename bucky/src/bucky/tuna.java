package bucky;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;

public class tuna extends food{
	//55 intro to polymorphism
	void eat(){
		System.out.println("This tuna is great");
	}
}

//52-54Event Handling/Action Listener/Event handling program
//public class tuna extends JFrame{
//	
//	private JTextField item1;
//	private JTextField item2;
//	private JTextField item3;
//	private JPasswordField passwordField;
//	
//	public tuna(){
//		super("The title");
//		setLayout(new FlowLayout());
//		item1 = new JTextField(10);
//		add(item1);
//		item2 = new JTextField("Enter text here");
//		add(item2);
//		item3 = new JTextField("Uneditable", 20);
//		item3.setEditable(false);
//		add(item3);
//		
//		passwordField=new JPasswordField("mypass");
//		add(passwordField);
//		
//		thehandler handler = new thehandler();
//		item1.addActionListener(handler);
//		item2.addActionListener(handler);
//		item3.addActionListener(handler);
//		passwordField.addActionListener(handler);
//		
//	}
//	
//	private class thehandler implements ActionListener{
//		
//		public void actionPerformed(ActionEvent event){
//			String string = "";
//			
//			if(event.getSource()==item1){
//				string = String.format("field 1: %s", event.getActionCommand());
//			}
//			else if(event.getSource()==item2){
//				string = String.format("field 2: %s", event.getActionCommand());
//			}
//			else if(event.getSource()==item3){
//				string = String.format("field 3: %s", event.getActionCommand());
//			}
//			else if(event.getSource()==passwordField){
//				string = String.format("password field is : %s", event.getActionCommand());
//			}
//			
//			JOptionPane.showMessageDialog(null, string);
//			
//		}
//		
//	}
//	
//}


//51-GUI with JFrame
//public class tuna extends JFrame{
//	
//	private JLabel item1;
//	
//	public tuna(){
//		super("The title bar");
//		setLayout(new FlowLayout());
//		item1= new JLabel("this is a sentence");
//		item1.setToolTipText("This is gonna show up on hover");
//		add(item1);
//				
//	}
//}


//public class tuna extends potpie{
		
	//49-Inheritance
//	public void eat(){
//		System.out.println("I am the eat method of tuna");
//	}
	
	//48-final
//	private int sum;
//	private final int NUMBER;
//	
//	public tuna(int x){
//		NUMBER=x;
//	}
//	
//	public void add(){
//		sum+=NUMBER;
//	}
//	
//	public String toString(){
//		return String.format("sum = %d\n",sum);
//	}
	
		
	
	//46-47 Static
//	private String first;
//	private String last;
//	private static int member = 0; // Static means it shared for all the object inside the class
//	
//	public tuna(String fn, String ln){
//		first = fn;
//		last = ln;
//		member++;
//		System.out.printf("Constructor for %s %s, members in the club: %d\n", first,last, member  );
//	}
//	
//	public String getFirst(){
//		return first;
//	}
//	public String getLast(){
//		return last;
//	}
//	
//	public static int getMembers(){
//		return member;
//	}
	
	
	//43 Composition
//	private String name;
//	private potpie birthday;
//	
//	public tuna(String theName,potpie theDate){
//		name = theName;
//		birthday = theDate;
//	}
//	
//	public String toString(){
//		return String.format("My name is %s, my birthday is %s", name, birthday );
//	}
	
	///Set and Get method
//	private int hour;
//	private int minute;
//	private int second;
//	
//	public tuna(){
//		this(0,0,0);
//	}
//	
//	public tuna(int h){
//		this(h,0,0);
//	}
//	
//	public tuna(int h, int m){
//		this(h,m,0);
//	}	
//	public tuna(int h, int m, int s){
//		setTime(h,m,s);
//	}
//	
//	public void setTime(int h, int m, int s)
//	{
//		setHour(h);
//		setMinute(m);
//		setSecond(s);
//	}
//	
//	public void setHour(int h){
//		hour = ((h>=0&&h<24)?h:0);
//	}
//	public void setMinute(int m){
//		minute = ((m>=0&&m<60)?m:0);
//	}
//	public void setSecond(int s){
//		second = ((s>=0&&s<60)?s:0);
//	}
//	
//	public int getHour(){
//		return hour;
//	}
//	public int getMinute(){
//		return minute;
//	}
//	public int getSecond(){
//		return second;
//	}
//	public String toMilitary(){
//		return String.format("%02d:%02d:%02d",getHour(),getMinute(),getSecond());
//	}
	
	//Multiple Constructor
//	private int hour;
//	private int minute;
//	private int second;
//	
//	public tuna(){
//		this(0,0,0);
//	}
//	
//	public tuna(int h){
//		this(h,0,0);
//	}
//	
//	public tuna(int h, int m){
//		this(h,m,0);
//	}	
//	public tuna(int h, int m, int s){
//		setTime(h,m,s);
//	}
//	
//	public void setTime(int h, int m, int s)
//	{
//		setHour(h);
//		setMinute(m);
//		setSecond(s);
//	}
	
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
	
//	public String toMilitary()
//	{
//		return String.format("%02d:%02d:%02d", hour, minute, second);
//	}
//	
//	public String toString(){
//		return String.format("%d:%02d:%02d %s",((hour==0 ||hour==12)?12:hour%12),minute,second,(hour<12?"AM":"PM"));
//	}
	
	
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
//}

//Enumeration

//public enum tuna{
//	bucky("nice","22"),
//	kelsey("cutie","10"),
//	julia("bigmistake","12"),
//	nicole("italian","13"),
//	candy("different","14"),
//	erin("iwish","16");
//	
//	private final String desc;
//	private final String year;
//	
//	tuna(String description, String birthdya){
//		desc = description;
//		year = birthdya;
//	}
//	
//	public String getDesc(){
//		return desc;
//	}
//	public String getYear(){
//		return year;
//	}
//}

