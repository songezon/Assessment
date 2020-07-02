package model;
import java.util.*;
public class ConversionApp {

	public static void main(String[] args) 
	{
 
		Conversion conv = new Conversion();
		//create scanner object to read input from keyboard
		Scanner sc = new Scanner(System.in);
		//Get kelvin from user input
		System.out.println("Please enter kelvin in numbers ");
	    double kelvin = sc.nextDouble();
		double celsius = conv.kelvinToCelsius(kelvin);
				
		//Get pounds from user input
		System.out.println("Please enter pounds in numbers ");
	    double pounds = sc.nextDouble();
		double kilograms = conv.poundsToKilograms(pounds);
				
		//Get miles from user input
		System.out.println("Please enter miles in numbers ");
	    double miles = sc.nextDouble();
		double kilometers = conv.milesToKilometers(miles);
		sc.close();
		//Display results to user
		System.out.println(kelvin + " kelvin is " + celsius + " degrees celsius.");
		System.out.println(pounds + " pounds is " + kilograms + " kilograms.");
		System.out.println(miles + " miles is " + kilometers + " kilometers.");
	}

}
