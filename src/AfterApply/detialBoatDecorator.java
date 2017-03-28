package AfterApply;

/**
 * @author Suphawit Kasemsirisopha [572115056] on Nov 27, 2016
 */
public class detialBoatDecorator extends boatDecorator {

	public detialBoatDecorator(ops decoratedOps) {
		super(decoratedOps);
		// TODO Auto-generated constructor stub
	}

	public void output(String m) {
		moreWord(decoratedOps, m);
	}

	private void moreWord(ops decoratedOps, String m) {
		System.out.println("We need " + m + " boats.");
	}
}
