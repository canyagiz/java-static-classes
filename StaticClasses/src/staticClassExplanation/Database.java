package staticClassExplanation;

public class Database {
	/*Static classes are only exists inside an outer class. In other words, there is no "outer static class".
	 * 
	 * Benefits of Static "inner" Classes:
	 * 
	 * 	2) Being Helper class: 
	 * However, for static inner classes, outer classes reference not needed.
	 * This feature is beneficial when accessing utility functions and constants.
	 * 
	 * E.x: Since MathHelper is static class, we can call square method without initializing "MathUtils class".
	 * */
	static class DatabaseHelper{
		static void connect() {
			System.out.println("Connection to https://localhost:8080 etc.");
		}
	}

}
