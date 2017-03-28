package BehavioralBefore;

import java.util.Scanner;

/**
 * @author Suphawit Kasemsirisopha [572115056] on Nov 29, 2016
 */
public class calcStrategyDemo {

	public static void main(String[] args) {

		float firstOperannd = 0;
		float secondOperannd = 0;
		float result = 0;
		int operator;
		Scanner input = new Scanner(System.in);
		boolean exitCalculator = false;
		Context context = new Context(new opeAdd());
				
		while (!exitCalculator) {
			System.out.println("Enter 1 for addition \n" 
			+ "Enter 2 for subtraction \n"
			+ "Enter 3 for multiplication \n" 
			+ "Enter 4 for division \n" 
			+ "Enter 0 for Exit : ");
			operator = input.nextInt();
			if (operator != 0){
				System.out.println("Enter first number : ");
				firstOperannd = input.nextInt();
				System.out.println("Enter second number : ");
				secondOperannd = input.nextInt();
			}
			
			switch (operator) {
			case 1:
				context = new Context(new opeAdd());
				System.out.println("Result is " + context.excuteStrategy(firstOperannd, secondOperannd));
				break;

			case 2:
				context = new Context(new opeSub());
				System.out.println("Result is " + context.excuteStrategy(firstOperannd, secondOperannd));
				break;

			case 3:
				context = new Context(new opeMul());
				System.out.println("Result is " + context.excuteStrategy(firstOperannd, secondOperannd));
				break;

			case 4:
				context = new Context(new opeDivi());
				System.out.println("Result is " + context.excuteStrategy(firstOperannd, secondOperannd));
				break;

			case 0:
				exitCalculator = true;
				System.out.println("Calculator program Terminated \n");
				break;

			default:
				System.out.println("Please provide proper input \n");

			}
		
		}

	}

}
