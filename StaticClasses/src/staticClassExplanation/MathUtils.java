package staticClassExplanation;

public class MathUtils {
	/*Static classes are only exists inside an outer class. In other words, there is no "outer static class".
	 * 
	 * Benefits of Static "inner" Classes:
	 * 
	 * 	1) Access without instance of outer class: When initializing inner classes, outer classes reference is needed. 
	 * However, for static inner classes, outer classes reference not needed.
	 * This feature is beneficial when accessing utility functions and constants.
	 * 
	 * E.x: Since MathHelper is static class, we can call square method without initializing "MathUtils class".
	 * */
	public static class MathHelper{
		static int square(int x) { return x*x;}		
	}
	

}


