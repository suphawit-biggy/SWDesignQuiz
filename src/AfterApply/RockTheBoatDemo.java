package AfterApply;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * @author Suphawit Kasemsirisopha [572115056]
 * on Nov 27, 2016
 */
public class RockTheBoatDemo {

	public static void main(String args[]) {
		ops opretation = new ConcreteOps();
		ops moreOperation = new detialBoatDecorator(new ConcreteOps());	
		
		String line;
		int w;
		int n;
		ArrayList<Integer> p;
		
		Scanner input = new Scanner(System.in);
		
		while(true) {
			line  = input.nextLine();
			if(line.isEmpty())
				continue;
			if(line.equals("00000"))									//if "00000" appear = end program.
				break;
			w =  Integer.parseInt(line);								//string to integer.
			String[] tokens = input.nextLine().split("\\s+");			//operation split the integer line of passenger's weigth into array by space.
			n = tokens.length;											//
			p = new ArrayList<Integer>();								//
			for(int i=0; i<n; i++)										//
				p.add(Integer.valueOf(tokens[i]));						//add the integer line of passenger's weigth into array.
			Collections.sort(p);										//sort passenger's array.
			
			int s = p.get(0);
			p.remove(0);
			if(s <= w) {
				opretation.output(""+opretation.putInBoat(w-s, 1, 1, w, p));					//call 2 operation output and putInBoat.
				moreOperation.output(""+opretation.putInBoat(w-s, 1, 1, w, p));
			}
		}
		opretation.output("00000");												//if "00000" appear = print 00000 back and end	
	}
	
}
