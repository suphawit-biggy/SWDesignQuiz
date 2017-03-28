package AfterApply;
import java.util.ArrayList;

/**
 * @author Suphawit Kasemsirisopha [572115056]
 * on Nov 27, 2016
 */
public abstract class boatDecorator implements ops{

	protected ops decoratedOps;
	
	public boatDecorator (ops decoratedOps){
		this.decoratedOps = decoratedOps;
	}
	
	public int putInBoat(int r, int t, int b, int w, ArrayList<Integer> p) {
		return decoratedOps.putInBoat(r, t, b, w, p);
	}
	
	public void output(String m) {
		decoratedOps.output(m);
	}
}
