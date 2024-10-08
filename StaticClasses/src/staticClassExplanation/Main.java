package staticClassExplanation;

public class Main {
    public static void main(String[] args) {
    	//Benefit 1
        // E.x: Since MathHelper is static class, we can call square method without initializing "MathUtils class".
        int result = MathUtils.MathHelper.square(5);
        System.out.println(result); // Output: 25
        
        //Benefit 2 *Benefit 1 & 2 are interbedded topics*
        Database.DatabaseHelper.connect();
        
        //Benefit 3
        // Sadece bir CacheEntry nesnesi oluşturduk, Cache sınıfının örneği oluşturulmadı.
        Cache.CacheEntry entry = new Cache.CacheEntry("session1", "User123Data");
        System.out.println(String.format("Entry's key: %s \nEntry's value: %s", entry.key, entry.value));
    }
}
