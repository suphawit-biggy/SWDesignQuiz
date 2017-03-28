package BehavioralBefore;

import java.util.Scanner;

/**
 * @author Suphawit Kasemsirisopha [572115056] on Nov 29, 2016
 */
public class opeSub implements Strategy {

	@Override
	public float operannd(float num1 ,float num2) {		
		return num1 - num2;
	}

}
