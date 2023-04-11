import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

public class Logger {
    


    public static void logToFile(String text) {
        try(FileWriter writer = new FileWriter("Toys.txt", true))
        { 
            writer.write(text);
            writer.append('\n');
            writer.flush();
        }
        catch (IOException ex) {

            System.out.println(ex.getMessage());
}
}

public static void logtoFileStartLottery() {
    try(FileWriter writer = new FileWriter("Toys.txt", true))
    { 
        Date date = new Date();
        writer.write("******************");
        writer.append('\n');
        writer.flush();
        writer.write("// Начало лотереи // " + date);
        writer.append('\n');
        writer.flush();
    }
    catch (IOException ex) {

        System.out.println(ex.getMessage());
}
}

}
