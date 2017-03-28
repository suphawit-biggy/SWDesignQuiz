package State;

import java.util.Scanner;

import BehavioralBefore.opeAdd;

/**
 * @author Suphawit Kasemsirisopha [572115056] on Nov 29, 2016
 */
public class calcStateDemo {

	public static void main(String[] args) {

		int operator;
		Scanner input = new Scanner(System.in);
		boolean exitCalculator = false;
		Context context = new Context();
		opeAddi add = new opeAddi();
		opeSubs sub = new opeSubs();
		opeMult mul = new opeMult();
		opeDiviv div = new opeDiviv();
				
		while (!exitCalculator) {
			System.out.println("Enter 1 for addition \n" 
			+ "Enter 2 for subtraction \n"
			+ "Enter 3 for multiplication \n" 
			+ "Enter 4 for division \n" 
			+ "Enter 0 for Exit : ");
			operator = input.nextInt();
			
			switch (operator) {
			case 1:
				add.calC(context);
				break;

			case 2:
				sub.calC(context);
				break;

			case 3:
				mul.calC(context);
				break;

			case 4:
				div.calC(context);
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
