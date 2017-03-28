package BeforeApply;

/**
 * @author Suphawit Kasemsirisopha [572115056]
 * on Nov 27, 2016
 */

import java.util.*;

public class RockTheBoat
{		
	public static int putInBoat(int r, int t, int b, int w, ArrayList<Integer> p) {
		//r = remaining weight
		//t = total passengers
		//b = times 0f shipping
		//w = total weight
		//p = ArrayList of passengers's weight
		if(p.size() == 0)
			return b;
		
		int a = -1;
		
		for(int i=0; i<p.size(); i++)	//process of operation putInBoat and calculate.
		{
			ArrayList<Integer> q = new ArrayList<Integer>(p);
			int s = p.get(i);
			int ret;
			if(s <= r) {
				q.remove(i);
				ret = putInBoat(r-s, t+1, b, w, q);	
			}
			else {
				if(t > 0) {
					q.remove(i);
					ret = putInBoat(w-s, 1, b+1, w, q);
				}
				else {
					return b;
				}
			}
			if(a > ret || a == -1)
				a = ret;
		}
		return a;
		
	}
	
	public static void main(String args[])
	{	
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
				output(""+putInBoat(w-s, 1, 1, w, p));					//print the result.
			}
		}
		output("00000");												//if "00000" appear = print 00000 back and end	
	}
	
	public static void output(String m) {
		System.out.println(m);
	}
}