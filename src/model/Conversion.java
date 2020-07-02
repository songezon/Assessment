package model;

public class Conversion 
{
   private double kelvin, celsius, pounds, 
   miles, kilometers, kilograms;

   //convert kelvin to celsius
   public double kelvinToCelsius(double kelvin)
   {
	   return celsius =  kelvin-272.15;
   }
	//convert pounds to kilograms
   public double poundsToKilograms(double pounds)
   {
	   return kilograms = pounds * 0.454;
	   
   }
    //convert miles to kilometers
   public double milesToKilometers(double miles)
   {
	    return kilometers = miles * 1.60934;
   }
   @Override
   public String toString() {
		return "Conversion [kelvin=" + kelvin + ", celsius=" + celsius 
			+ ", pounds=" + pounds + ", miles=" + miles+ ", kilometers=" 
			+ kilometers + ", kilograms=" + kilograms + "]";
	}
   
}
