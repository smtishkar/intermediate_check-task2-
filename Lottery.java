import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Queue;

public class Lottery {

    // public static void queueCreation(Queue<ToysList> queue, ArrayList<ToysList> newlistOfToys) {

    //     for (ToysList toys : newlistOfToys) {
    //         queue.add(toys);
    //     }
    // }

    // public static void lotteryProgress(Queue<ToysList> queue) {

    //     for (int i = 0; i < program.numberofToys; i++) { // Не хорошо, что мы отсюда обращаемся к переменной в программе
    //         System.out.println("Участнику достается: " + queue.element());
    //         queue.remove();
    //         if (queue.isEmpty())
    //             System.out.println("Розыгрыш окончен, игрушек больше нет");
    //     }

    // }

    // static void newsortList(ArrayList<ToysList> toys) {
    // Collections.sort(toys, new Comparator<Object>() {
    // @Override
    // public int compare(Object o1, Object o2) {
    // return Float.compare(o1.getChance(), o2.getChance());
    // }
    // });


    public static void lotteryProcess (int numberofToys, ArrayList<ToysList> newlistOfToys){
    for (int i = 0; i < numberofToys; i++) {
        ToysList item = (Randomizer.chooseChance(newlistOfToys)); 
        Logger.logToFile(item.toString());; 
        System.out.println("Выпала игрушка --> " + item);
        newlistOfToys.remove(item);
        if (newlistOfToys.isEmpty())
            System.out.println("Розыгрыш окончен, игрушек больше нет");   
    }
    }

    

}
