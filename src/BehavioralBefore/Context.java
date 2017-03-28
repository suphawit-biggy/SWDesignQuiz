package BehavioralBefore;

/**
 * @author Suphawit Kasemsirisopha [572115056] on Nov 29, 2016
 */
public class Context {

		private Strategy strategy;
		
		public Context (Strategy strategy) {
			this.strategy = strategy;
		}
		
		public float excuteStrategy(float num1, float num2){
			return strategy.operannd(num1, num2);
		}
}
