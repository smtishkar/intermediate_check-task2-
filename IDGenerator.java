import java.util.UUID;

public class IDGenerator {

    // метод для генерации случайного ID номера для игрушки (специально "обрезан" до 8 символов)
    public static String IDGenerator() {
        UUID uuid = UUID.randomUUID();
        String id = uuid.toString();
        String resultID = id.substring(0, 8);
        return resultID;

    }

}
