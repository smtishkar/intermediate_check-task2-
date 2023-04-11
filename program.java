import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * program
 */
public class program {

    static final int numberofToys = 10;
    public static ArrayList<ToysList> initialListOfToys = new ArrayList<>();
    public static ArrayList<ToysList> newlistOfToys = new ArrayList<>();
    public static Queue<ToysList> queue = new LinkedList<>();

    public static void main(String[] args) {

        // Создаем список игрушек
        System.out.println("Исходный список");
        ListsHandover.createListOfToys(initialListOfToys, numberofToys);
        // createListOfToys(initialListOfToys, numberofToys);
        initialListOfToys.forEach(n -> System.out.println(n.toString()));

        // Клонируем список игрушек, чтобы в дальнейшем его можно было изменять и
        // удалять разыгранные игрушки
        System.out.println();
        System.out.println("Клонированный список");
        newlistOfToys = ListsHandover.clonListOfToys(initialListOfToys);
        newlistOfToys.forEach(n -> System.out.println(n.toString()));

        // Реализация процесса розыгрыша игрушек
        System.out.println();
        System.out.println("Начало розыгрыша");
        Logger.logtoFileStartLottery();

        Lottery.lotteryProcess(numberofToys, newlistOfToys);

    }

}
