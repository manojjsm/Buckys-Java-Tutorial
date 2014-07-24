package bucky;
import java.util.Scanner;
import java.util.Random;
import java.util.EnumSet;

import javax.swing.JOptionPane;
import javax.swing.JFrame;

class apples{

	public static void main(String args[]){
		
		//55 intro to polymorphism
		food bucky[]= new food[2];
		bucky[0] = new potpie();
		bucky[1] = new tuna();
		
		for (int x = 0; x < 2; x++) {
			bucky[x].eat();
		}
		
//		tuna bucky = new tuna();
//		food bucky = new tuna();
		
		//54 Event Handler Program
//		tuna bucky = new tuna();
//		
//		bucky.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		bucky.setSize(350,100);
//		bucky.setVisible(true);
		
		//51-GUI with JFrame
//		tuna bucky = new tuna();
//		
//		bucky.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		bucky.setSize(275, 180);
//		bucky.setVisible(true);
		
		
		//50-GUI
//		String fn = JOptionPane.showInputDialog("Enter first number");
//		String sn = JOptionPane.showInputDialog("Enter second number");
//		
//		int num1 = Integer.parseInt(fn);
//		int num2 = Integer.parseInt(sn);
//		int sum = num1 + num2;
//		
//		JOptionPane.showMessageDialog(null,"The answer is "+sum,"The title",JOptionPane.PLAIN_MESSAGE);		
		
		//49-Inheritance
//		tuna tunaObject = new tuna();
//		potpie potObject = new potpie();
//		
//		tunaObject.eat();
//		potObject.eat();
		
		//48-final
//		tuna tunaObject = new tuna(10);
//		
//		for (int i = 0; i < 5; i++) {
//			tunaObject.add();
//			System.out.printf("%s",tunaObject);
//		}
		//46-47 Static
//		tuna member1 = new tuna("Megan","Fox");
//		tuna member2 = new tuna("Natalie","Portman");
//		tuna member3 = new tuna("Taylor","Swift");
//		
//		System.out.println(tuna.getMembers());
		
//		System.out.println();
//		System.out.println(member2.getFirst());
//		System.out.println(member2.getLast());
//		System.out.println(member2.getMembers());
		
		
		//44-Enumeration
//		for(tuna people:tuna.values()){
//			System.out.printf("%s\t%s\t%s\n",people,people.getDesc(),people.getYear());
//		}
//		//45-EnumSet range
//		System.out.println("\nAnd now for the range of constants!!\n");
//		for(tuna people:EnumSet.range(tuna.kelsey,tuna.candy))
//			System.out.printf("%s\t%s\t%s\n",people,people.getDesc(),people.getYear());
		
		//43 Composition - Refering to objects in other classes
//		potpie potObject = new potpie(4,5,6);
//		tuna tunaObject = new tuna("Greg",potObject);
//		
//		System.out.println(tunaObject);
		
		//toString
		
//		potpie potObject = new potpie(4,5,6);
		
		//Building Objects for constructors
		//--Overloaded constructor
//		tuna tunaObject = new tuna();
//		tuna tunaObject2 = new tuna(5);
//		tuna tunaObject3 = new tuna(5,13);
//		tuna tunaObject4 = new tuna(5,13,43);
//		
//		System.out.printf("%s\n", tunaObject.toMilitary());
//		System.out.printf("%s\n", tunaObject2.toMilitary());
//		System.out.printf("%s\n", tunaObject3.toMilitary());
//		System.out.printf("%s\n", tunaObject4.toMilitary());
		
		//Public, Private and this
//		tuna tunaObject = new tuna();
//		System.out.println(tunaObject.toMilitary());
//		System.out.println(tunaObject.toString());
//		tunaObject.setTime(13, 27, 6);
//		System.out.println(tunaObject.toMilitary());
//		System.out.println(tunaObject.toString());
		
		//Display Regular time
//		tuna tunaObject = new tuna();
//		System.out.println(tunaObject.toMilitary());
//		System.out.println(tunaObject.toString());
//		tunaObject.setTime(13, 27, 6);
//		System.out.println(tunaObject.toMilitary());
//		System.out.println(tunaObject.toString());
		
		//Time class
//		tuna tunaObject = new tuna();
//		
//		System.out.println(tunaObject.toMilitary());
//		tunaObject.setTime(13, 27, 6);
//		System.out.println(tunaObject.toMilitary());
//		
		
		//Variable Length
		//System.out.println(average(43,56,76,8,65,76,2,31));
		
		
		
		//Multidimensional Array
//		int firstarray[][] = {{8,9,10,11},{12,13,14,15}};
//		int secondarray[][]= {{30,31,32,33},{43},{4,5,6}};
//		System.out.println("This is the first array: ");
//		display(firstarray);
//		System.out.println("This is the second array: ");
//		display(secondarray);
		
		//int val = secondarray[0][1];
		//firstarray[0][1];
		
		
		
		//Arrays in methods
//		int bucky[]={3,4,5,6,7};
//		change(bucky);
//		for(int y:bucky)
//		{
//			System.out.println(y);
//		}
		
		
		//Enhanced for loop
//		int bucky[]={3,4,5,6,7};
//		int total=0;
//		
//		for(int x:bucky){
//			total+=x;
//		}
//		
//		System.out.println(total);
		
		//Array Elements as Counters
//		Random rand = new Random();
//		int freq[] = new int[7];
//		
//		for (int roll = 1; roll < 1000; roll++) {
//			++freq[1+rand.nextInt(6)];
//		}
//		
//		System.out.println("Face\tFrequency");
//		
//		for(int face=1;face<freq.length;face++){
//			System.out.println(face+"\t"+freq[face]);
//		}
		//Summing Array Element
//		int bucky[]={21,16,86,21,3};
//		int sum=0;
//		for (int counter = 0; counter < bucky.length; counter++) {
//			sum+=bucky[counter];
//		}
//		System.out.println("The sum of these number is: " + sum);
		
		//Creating and Array Table
//		System.out.println("Index\tValue");
//		int bucky[]={32,12,18,54,2};
//		
//		for (int counter = 0; counter < bucky.length; counter++) {
//			System.out.println(counter + "\t" + bucky[counter]);
//		}
		
		//Introduction to Array
//		int bucky[]={2,4,5,7,9};//Array initializer
//		
//		System.out.println(bucky[2]);
		
//		int bucky[] = new int[10];
//		
//		bucky[0] = 87;
//		bucky[1] = 543;
//		bucky[9] = 65;
//		
//		System.out.println(bucky[1]);
		//Random Number Generator
//		Random dice = new Random();
//		int number;
//		for (int counter = 0; counter <= 10; counter++) {
//			number = 1 + dice.nextInt(6);
//			System.out.println(number);
//			
//		}
//			
		
		//Math class method
//		System.out.println(Math.abs(-26.7));
//		System.out.println(Math.ceil(7.4));
//		System.out.println(Math.floor(7.4));
//		System.out.println(Math.max(8.6,5.2));
//		System.out.println(Math.min(8.6,5.2));
//		System.out.println(Math.pow(5,3));
//		System.out.println(Math.sqrt(9));
		
		//do while loops
//		int counter = 15;
//		
//		do{
//			System.out.println(counter);
//			counter++;
//		}while(counter<=10);
				
		//Compound Interest Program
		//A = P(1+R)^
		
//		double amount;
//		double principal = 10000;
//		double rate = .01;
//		
//		for (int day = 1; day <= 20; day++) {
//			amount=principal*Math.pow(1+rate,day);
//			System.out.println(day+ " "+ amount);
//			
//		}
		
		
		
		//for loops
//		for (int counter = 6; counter <= 21; counter+=3) {
//			System.out.println(counter);
//		}
		
		
		//Simple Averaging Program
//		Scanner input = new Scanner(System.in);
//		int total = 0;
//		int grade;
//		int average;
//		int counter = 0;
//		
//		while (counter<10){
//			
//			grade = input.nextInt();
//			total = total+grade;
//			counter++;
//			
//		}
//		
//		average = total/10;
//		System.out.println("Your average is: "+ average);
		
		//Conditional Operator
//		int age = 21;
//		
//		System.out.println(age >50?"You are old":"You are young");
//		
//		
//		//else if statement
//		int age = 55;
//		
//		if(age>=60)
//			System.out.println("You are a senior citizen");
//		else if(age>=50)
//			System.out.println("You are in younr 50s");
//		else if(age>=40)
//			System.out.println("You are in younr 40s");
//		else
//			System.out.println("You are a young buck");
//		
		
		//Nested if statements
//		int age = 60;
//		
//		if(age< 50)
//		{
//			System.out.println("You are young");
//		}
//		else{
//			System.out.println("You are old");
//			if(age > 75){
//				System.out.println("You are REALLY old!");
//			}
//			else{
//				System.out.println("dont worry you arent really that old");
//			}
//		}
		
		
		//Constructor
//		tuna tunaObject= new tuna("Kelsey");
//		tuna tunaObject2= new tuna("Nicole");
//		tunaObject.saying();
//		tunaObject2.saying();
//		
		//Many methods and instances
//		Scanner input = new Scanner(System.in);
//		tuna tunaObject= new tuna();
//		
//		System.out.println("Enter name of first gf here: ");
//		String temp = input.nextLine();
//		
//		tunaObject.setName(temp);
//		tunaObject.saying();
		
//		Scanner input = new Scanner(System.in);
//		tuna tunaObject= new tuna();
//		
//		System.out.println("Enter your name here: ");
//		String name = input.nextLine();
//		
//		tunaObject.simpleMessage(name);
		
		
		
//		tuna tunaObject = new tuna();
//		
//		tunaObject.simpleMessage();
//		
		
//		int counter = 0;
//		
//		while (counter<10)
//		{
//			System.out.println(counter);
//			counter++;
//		}
		
//		int age;
//		age = 7;
//		
//		switch(age){
//		case 1:
//			System.out.println("You can crawl");
//			break;
//		case 2:
//			System.out.println("You can talk");
//			break;
//		case 3:
//			System.out.println("You can get in trouble");
//			break;
//		default:
//			System.out.println("I dont know how old you are");
//			break;
//		
//		}
		
		
		
//		int boy,girl;
//		boy = 18;
//		girl = 68;
//		
//		if (boy >10 && girl<60){
//			
//			System.out.println("You can enter");
//						
//		}
//		else{
//			System.out.println("You cannot enter");
//		}
//		
	}
	
	public static void change(int x[])
	{
		for(int counter = 0; counter<x.length;counter++)
			x[counter]+=5;
		
		
	}
	
	public static void display(int x[][]){
		for (int row = 0; row < x.length; row++) {
			for (int column = 0; column < x[row].length; column++) {
				System.out.print(x[row][column] + " \t");
			}
			System.out.println();
		}
	}
	
	public static int average(int...numbers)
	{
		int total=0;
		for(int x:numbers)
			total+=x;
		
		return total/numbers.length;
	}
}