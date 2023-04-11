import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.locks.LockSupport;


/**
 * program
 */
public class program {

    static final int numberofToys = 10;
    public static ArrayList<ToysList> initialListOfToys = new ArrayList<>();
    public static ArrayList<ToysList> newlistOfToys = new ArrayList<>();
    public static Queue<ToysList> queue = new LinkedList<>();

    public static void main(String[] args) {

        System.out.println("Исходный список");
        createListOfToys(initialListOfToys);
        initialListOfToys.forEach(n -> System.out.println(n.toString()));

        System.out.println();
        System.out.println("Клонированный список");
        newlistOfToys = clonListOfToys(initialListOfToys);
        newlistOfToys.forEach(n -> System.out.println(n.toString()));


        // Lottery.queueCreation(queue, newlistOfToys);
        // System.out.println(queue);

        // System.out.println("Это иигрушка");
        // System.out.println(Randomizer.chooseChance(newlistOfToys));
        // System.out.println(Randomizer.chooseChance(newlistOfToys));

        


        // ToysList toy = Randomizer.chooseChance(newlistOfToys);
        // System.out.println(toy);






        // PrintWriter writer = new PrintWriter("the-file-name.txt", "UTF-8");
        // writer.println(toy.toString());   
        
        // newlistOfToys.remove(Randomizer.chooseChance(newlistOfToys));
  
        // System.out.println(newlistOfToys);

        System.out.println();
        System.out.println("Начало розыгрыша");
        Logger.logtoFileStartLottery();





        Lottery.lotteryProcess(numberofToys, newlistOfToys);



        // for (int i = 0; i < numberofToys; i++) {
        //     ToysList item = (Randomizer.chooseChance(newlistOfToys)); 
        //     Logger.logToFile(item.toString());; 
        //     System.out.println("Выпала игрушка --> " + item);
        //     newlistOfToys.remove(item);
        //     if (newlistOfToys.isEmpty())
        //         System.out.println("Розыгрыш окончен, игрушек больше нет");   
        // }








        //Берем 
        // for (ToysList toy : newlistOfToys) {
        //     queue.add(Randomizer.chooseChance(newlistOfToys));     
        // }
        // System.out.println();
        // System.out.println("Новая очередь");  
        // System.out.println(queue);
        

        // System.out.println();
        // System.out.println("Общее значение всех вероятностей");
        // int ttlProbab = Randomizer.ttlProbabilityCalculation(initialListOfToys);
        // System.out.println(ttlProbab);

        // System.out.println();
        // System.out.println("Клонированный список с взвешенными вероятностями");
        // Randomizer.weigedProbabilityCalculation(newlistOfToys, ttlProbab);
        // newlistOfToys.forEach(n -> System.out.println(n.toString()));
        // // Randomizer.chanceCalculation(newlistOfToys);



        // newsortList(newlistOfToys);

        // System.out.println();
        // System.out.println("Отсортированный список");
        // newlistOfToys.forEach(n -> System.out.println(n.toString()));
        // newlistOfToys.forEach(n -> System.out.println(n.toString()));
        // System.out.println();
        // sortList(newlistOfToys);
        // newlistOfToys.forEach(n -> System.out.println(n.toString()));

        // Lottery.queueCreation(queue, newlistOfToys);
        // System.out.println(queue);

        // Lottery.lotteryProgress(queue);
        // System.out.println(queue);

        // Очередь создание и розыгрышь
        // Queue<ToysList> queue = new LinkedList<>();
        // for (ToysList toys : newlistOfToys) {
        // queue.add(toys);
        // }
        // System.out.println("Начинаем розыгрыш");
        // for (int i = 0; i < numberofToys; i++) {
        // System.out.println("Участнику достается: " + queue.element());
        // queue.remove();
        // if (queue.isEmpty())
        // System.out.println("Игрушек больше нет");
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
                    listOfToys.add(new ToysList(IDGenerator.IDGenerator(), "Машинка", 30));
                    break;
                case 1:
                    listOfToys.add(new ToysList(IDGenerator.IDGenerator(), "Конструктор", 40));
                    break;
                case 2:
                    listOfToys.add(new ToysList(IDGenerator.IDGenerator(), "Робот", 50));
                    break;
                case 3:
                    listOfToys.add(new ToysList(IDGenerator.IDGenerator(), "Мягкая игрушка", 20));
                    break;
                default:
                    break;
            }
        }
    }

    // static void sortList(ArrayList<ToysList> toys) {
    // toys.sort(new Comparator<ToysList>() {

    // @Override
    // public int compare(ToysList o1, ToysList o2) {
    // return o2.getChance(). - o1.getChance();
    // }
    // });
    // }

    static void newsortList(ArrayList<ToysList> toys) {
            Collections.sort(toys, new Comparator<Object>() {
        @Override
        public int compare(Object o1, Object o2) {
            return Float.compare(((ToysList) o2).getChance(), ((ToysList) o1).getChance());
        }
    });

}





}