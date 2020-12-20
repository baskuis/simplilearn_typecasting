package typecasting;

import java.util.Scanner;

public class Example {

	public static void main (String[] arg) {
		System.out.println("Enter how many dollhairs");
		Scanner input = new Scanner(System.in);
	    short allMyDollhairs = input.nextShort();
	    byte myDollhairs = (byte) allMyDollhairs;
	    
	    System.out.println("All my dollhairs");
	    System.out.println(allMyDollhairs);
	    
	    System.out.println("My dollhairs");
	    System.out.println(myDollhairs);
	    
	    if (allMyDollhairs == myDollhairs) {
	    	System.out.println("My dollhairs are there");
	    } else {
	    	System.out.println("My dollhairs are all gone");
	    }
	    
	    
	    
	}
	
}
