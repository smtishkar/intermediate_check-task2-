import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Random;
import java.util.UUID;


/**
 * program
 */
public class program {

    static final int numberofToys = 10;
    public static ArrayList<ToysList> initialListOfToys = new ArrayList<>();
    public static ArrayList<ToysList> newlistOfToys = new ArrayList<>();
    public static Queue<ToysList> queue = new LinkedList<>();

    public static void main(String[] args) {

        createListOfToys(initialListOfToys);
        initialListOfToys.forEach(n -> System.out.println(n.toString()));


        System.out.println("Клонированный список");
        newlistOfToys = clonListOfToys(initialListOfToys);
        newlistOfToys.forEach(n -> System.out.println(n.toString()));


        //делаем рандомайзер
        // Random random = new Random();
        // int x = random.nextInt(100);

        // for (ToysList toy : newlistOfToys) {
        //     x = random.nextInt(100);
        //     int newChance = toy.getChance() * x;
        //     toy.setChance(newChance);
        // }

        System.out.println("Тут взвешенное значение");
        int ttlProbab = Randomizer.ttlProbabilityCalculation(initialListOfToys);
            System.out.println(ttlProbab);
        Randomizer.weigedProbabilityCalculation(initialListOfToys, ttlProbab);
        System.out.println(initialListOfToys);
        // Randomizer.chanceCalculation(newlistOfToys);




        System.out.println("Тут новые данные");
        newlistOfToys.forEach(n -> System.out.println(n.toString()));

        // System.out.println();
        // sortList(newlistOfToys);
        // newlistOfToys.forEach(n -> System.out.println(n.toString()));

        Lottery.queueCreation(queue, newlistOfToys);
        System.out.println(queue);

        Lottery.lotteryProgress(queue);
        System.out.println(queue);

        //  Очередь создание и розыгрышь
        // Queue<ToysList> queue = new LinkedList<>();
        // for (ToysList toys : newlistOfToys) {
        //     queue.add(toys);
        // }
        // System.out.println("Начинаем розыгрыш");
        // for (int i = 0; i < numberofToys; i++) {
        //     System.out.println("Участнику достается: " + queue.element());
        //     queue.remove();
        //     if (queue.isEmpty())
        //         System.out.println("Игрушек больше нет");
        // }
        // System.out.println(queue);






    }

    public static ArrayList<ToysList> clonListOfToys(ArrayList<ToysList> list) {
        ArrayList<ToysList> clone = new ArrayList<ToysList>(list.size());
        clone.addAll(list);
        return clone;
    }

    static void createListOfToys(ArrayList listOfToys) {
        for (int i = 0; i < numberofToys; i++) {
            switch (new Random().nextInt(4)) {
                case 0:
                    listOfToys.add(new ToysList(1, "Машинка", 30));
                    break;
                case 1:
                    listOfToys.add(new ToysList(2, "Конструктор", 40));
                    break;
                case 2:
                    listOfToys.add(new ToysList(3, "Робот", 50));
                    break;
                case 3:
                    listOfToys.add(new ToysList(4, "Мягкая игрушка", 20));
                    break;
                default:
                    break;
            }
        }
    }

    // static void sortList(ArrayList<ToysList> toys) {
    //     toys.sort(new Comparator<ToysList>() {

    //         @Override
    //         public int compare(ToysList o1, ToysList o2) {
    //             return o2.getChance(). - o1.getChance();
    //         }
    //     });
    // }

}