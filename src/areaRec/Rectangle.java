package areaRec;

import java.util.*;

public class Rectangle {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		String keepGoing = "";
		int count = 0;
		
		System.out.println(" ********______====d-_-b_This Is My Area_d-_-b====______********");
		System.out.println("   ******What's____=====|_______________|=====____Yours?******");
		

		System.out.println("");
		
		do {
			System.out.print("Enter the length: ");
			double length = in.nextDouble();
			System.out.println("");
			System.out.print("Enter the Width: ");
			double width = in.nextDouble();

			Area returnArea = new Area(length, width);
			returnArea.print();

			count++;
			//System.out.println(count);
			System.out.println("Would you like to find another one? Yes |or| No");
			keepGoing = in.next();
		} while (keepGoing.equalsIgnoreCase("Yes"));

		if (keepGoing.equalsIgnoreCase("No")) {
			System.out.println("Thank you for creating "+ count +" areas with our program!");

		}
	}

}














		
	

