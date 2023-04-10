import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Logger {
    
    public static void logToFile(Array) {
        try(FileWriter writer = new FileWriter("Toys.txt", true))
        { 
            writer.write("ffffffffffffffff");
            writer.append('\n');
            writer.flush();
        }
        catch (IOException ex) {

            System.out.println(ex.getMessage());
}
}
}
