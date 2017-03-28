package AfterApply;
import java.util.ArrayList;

/**
 * @author Suphawit Kasemsirisopha [572115056] on Nov 27, 2016
 */
public class ConcreteOps implements ops {

	@Override
	public int putInBoat(int r, int t, int b, int w, ArrayList<Integer> p) {
		// TODO Auto-generated method stub
		if (p.size() == 0)
			return b;

		int a = -1;

		for (int i = 0; i < p.size(); i++) {
			ArrayList<Integer> q = new ArrayList<Integer>(p);
			int s = p.get(i);
			int ret;
			if (s <= r) {
				q.remove(i);
				ret = putInBoat(r - s, t + 1, b, w, q);
			} else {
				if (t > 0) {
					q.remove(i);
					ret = putInBoat(w - s, 1, b + 1, w, q);
				} else {
					return b;
				}
			}
			if (a > ret || a == -1)
				a = ret;
		}
		return a;
	}

	@Override
	public void output(String m) {
		// TODO Auto-generated method stub
		System.out.println(m);
	}

}
