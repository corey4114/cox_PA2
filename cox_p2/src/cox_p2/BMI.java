package cox_p2;

import java.util.Scanner;

public class BMI {

	private static Scanner input;

	public static void main(String[] args) {
		int option;
		double pounds, inches, kilograms, meters;
		double BMI = 0;
		input = new Scanner(System.in);
		System.out.print("Select either 1(Imperial[lb/in]) or 2(Metric[kg/m]): ");
		option = input.nextInt();
		
		switch(option) {
			case 1: System.out.print("Your weight (in pounds): ");
			pounds = input.nextDouble();
			System.out.print("Your height (in inches): ");
			inches = input.nextDouble();
			BMI = (703 * pounds) / (inches * inches);
			break;
			
			case 2: System.out.print("Your weight (in kilograms): ");
			kilograms = input.nextDouble();
			System.out.print("Your height (in meters): ");
			meters = input.nextDouble();
			BMI = kilograms / (meters * meters);
			break;
		}
		
		if(BMI<=18.5)
			System.out.printf("Your BMI is %f, which is less than 18.5: Underweight", BMI);
			else if(BMI<=24.9)
			System.out.printf("Your BMI is %f, which is between 18.5-24.9: Normal Weight", BMI);
			else if(BMI<=29.9)
			System.out.printf("Your BMI is %f, which is between 25-29.9: Overweight", BMI);
			else
			System.out.printf("Your BMI is %f, which is 30.0 or greater: Obese", BMI);

	}
}