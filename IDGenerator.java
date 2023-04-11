import java.util.UUID;

public class IDGenerator {
    
    public static String IDGenerator() {
        UUID uuid = UUID.randomUUID();
        // System.out.println(uuid);
        String id = uuid.toString();
        String resultID = id.substring(0, 8);
        // System.out.println(resultID);
        return resultID;

    }
    

    
    
    
}
