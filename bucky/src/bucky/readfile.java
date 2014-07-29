package bucky;
import java.io.*;
import java.util.*;

public class readfile {
	private Scanner x;
	
	public void openFile(){
		try{
			x = new Scanner(new File("chinese.txt"));
		}
		catch(Exception e){
			System.out.println("could not find file");
		}
	}
	
	public void readFile(){
		while(x.hasNext()){
			String a = x.next();
			String b = x.next();
			String c = x.next();
			System.out.printf("%s %s %s\n", a,b,c);
			
		}
	}
	
	public void closefile(){
		x.close();
	}
	
}
