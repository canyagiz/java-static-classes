package staticClassExplanation;

import java.util.HashMap;
import java.util.Map;

public class Cache {
	/*Additional information, Map is an interface which is using for storing key and value pairs.
	 * since HashMap class implements Map interface, please open HashMap's decleration with "F3" to be ensure,
	 * Map<String, String> means type of the key and value are both String.
	 * 
	 *  A question about might be asked, why there is CacheEntry even if there is a HashMap data structure which stores information, there are several reasons beyond it:
	 *  1) Storing additional data,
	 *  2) Adding specialized methods
	 *  3)Encapsulation and more
	 *  However, since the topic is not Maps, these gonna be covered later. Focus only the usage of static classes.
	 *  */
	private Map<String, String> data = new HashMap<>();

	/* It identifies "data" in Cache class 
	 * E.x: There is a web site and the website storing results of requestes come from client as ChaceEntry Object.
	 * The benefit of static ChaceEntry class is we can store key value pairs without init. Cache object.
	 * */
	public static class CacheEntry {
		String key;
		String value;

		// Constructor of inner static class
		public CacheEntry(String key, String value) {
			this.key = key;
			this.value = value;
		}

	}
}
