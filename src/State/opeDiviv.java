package State;

import java.util.Scanner;

/**
 * @author Suphawit Kasemsirisopha [572115056] on Nov 29, 2016
 */
public class opeDiviv implements State {

Scanner input = new Scanner(System.in);
	
	@Override
	public void calC(Context context) {
		System.out.println("Enter first number : ");
        float firstOperannd = input.nextInt();
        System.out.println("Enter second number : ");
        float secondOperannd = input.nextInt();
        System.out.println("Result is " + (firstOperannd / secondOperannd));
		context.setState(this);
	}

}
