/* This program converts American units into metric units and vice versa.
*@Kailan Campbell
*/
//Inserting scanner
import java.util.Scanner;
//Starting the program
public class DimensionalAnalysis {
	//Defining main method.
	public static void main(String[] args) {
		//Creating a new scanner
		Scanner input = new Scanner(System.in);
		int useAgain;
		do {
		//Welcoming user and giving them instructions
		System.out.println("This is the Dimensional Analysis converter. This program converts American units into metric units.");
		System.out.println("Press 1 to convert American units to metric and press 2 to convert metric units to American units.");
		//Setting conversion type
		int conversion = input.nextInt();
		//American units to metric units
		if (conversion == 1) {
			//Asking for user feedback on the unit being converted
			System.out.println("Enter 1 for ounces/oz (mass), 2 for fluid ounces/oz (volume), 3 for pounds/lb (mass), 4 for inches (length), 5 for miles (length), and 6 for quarts/qt (volume).");
			int conversionType = input.nextInt();
			//Converting ounces to grams
			if (conversionType == 1) {
				System.out.println("How many ounces?");
				double ounces = input.nextDouble();
				System.out.println(ounces + " ounces is equivalent to " + (ounces * 28.3495231) + " grams (g).");
			}
			//Converting fluid ounces to milliliters
			else if (conversionType == 2) {
				System.out.println("How many fluid ounces?");
				double fluidOunces = input.nextDouble();
				System.out.println(fluidOunces + " fluid ounces is equivalent to " + (fluidOunces * 29.5735296) + " milliliters (mL).");
			}
			//Converting pounds to kilograms
			else if (conversionType == 3) {
				System.out.println("How many pounds?");
				double pounds = input.nextDouble();
				System.out.println(pounds + " pounds is equivalent to " + (pounds * 0.45359237) + " kilograms (kg).");
			}
			//Converting inches to centimeters
			else if (conversionType == 4) {
				System.out.println("How many inches?");
				double inches = input.nextDouble();
				System.out.println(inches + " inches is equivalent to " + (inches * 2.54) + " centimeters (cm).");
			}
			//Converting miles to kilometers 
			else if (conversionType == 5) {
				System.out.println("How many miles?");
				double miles = input.nextDouble();
				System.out.println(miles + " miles is equivalent to " + (miles * 1.609344) + "kilometers (km).");
			}
			//Converting quarts to liters
			else if (conversionType == 6) {
				System.out.println("How many quarts?");
				double quarts = input.nextDouble();
				System.out.println(quarts + " quarts is equivalent to " + (quarts * 0.946353) + " liters (l).");
			}
			//Giving feedback if the user entered something other than the defined numbers
			else {
				System.out.println("Invalid number. Please try again.");
			}
		}
			//Metric units to American units
			else if (conversion == 2) {
			//Setting conversion type
			System.out.println("Enter 1 for grams/g (mass), 2 for milliliters/mL (volume), 3 for kilograms/kg (mass), 4 for centimeters (length), 5 for kilometers (length), and 6 for liters (volume).");
			int conversionType = input.nextInt();
			//Grams to ounces
			if (conversionType == 1) {
				System.out.println("How many grams?");
				double grams = input.nextDouble();
				System.out.println(grams + " grams is equivalent to " + (grams / 28.3495231) + " ounces(oz).");
			}
			//Milliliters to fluid ounces
			else if (conversionType == 2) {
				System.out.println("How many milliliters?");
				double milliliters = input.nextDouble();
				System.out.println(milliliters + " milliliters is equivalent to " + (milliliters / 29.5735296) + " fluid ounces (oz).");
			}
			//Kilograms to pounds
			else if (conversionType == 3) {
				System.out.println("How many kilograms?");
				double kilograms = input.nextDouble();
				System.out.println(kilograms + " kilograms is equivalent to " + (kilograms / 0.45359237) + " pounds (lb).");
			}
			//Centimeters to inches
			else if (conversionType == 4) {
				System.out.println("How many centimeters?");
				double centimeters = input.nextDouble();
				System.out.println(centimeters + " centimeters is equivalent to " + (centimeters / 2.54) + " inches (in).");
			}
			//Kilometers to miles
			else if (conversionType == 5) {
				System.out.println("How many kilometers?");
				double kilometers = input.nextDouble();
				System.out.println(kilometers + " kilometers is equivalent to " + (kilometers / 1.609344) + " miles.");
			}
			//Liters to quarts
			else if (conversionType == 6) {
				System.out.println("How many liters?");
				double liters = input.nextDouble();
				System.out.println(liters + " liters is equivalent to " + (liters / 0.946353) + " quarts (qt).");
			}
			//Giving feedback if the user entered something other than the defined numbers
			else { 
				System.out.println("Invalid number. Please try again.");
			}
		}
		//Asking if the user wants to perform another conversion
		System.out.println("Would you like to perform another conversion? 1 for yes and anything else to exit.");
		useAgain = input.nextInt();
		//All of this repeats itself if the user wants to perform another conversion
		} while (useAgain == 1);
		//If the user doesn't want another conversion, the program gives a goodbye message and ends.
		if (useAgain != 1) {
		System.out.println("Okay. Thank you for using the Dimensional Analysis converter!");
		}
	}
}