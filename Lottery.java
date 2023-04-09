import java.util.ArrayList;
import java.util.Queue;

public class Lottery {

    public static void queueCreation(Queue<ToysList> queue, ArrayList<ToysList> newlistOfToys) {

        for (ToysList toys : newlistOfToys) {
            queue.add(toys);
        }
    }

    public static void lotteryProgress(Queue<ToysList> queue) {

        for (int i = 0; i < program.numberofToys; i++) { // Не хорошо, что мы отсюда обращаемся к переменной в программе
            System.out.println("Участнику достается: " + queue.element());
            queue.remove();
            if (queue.isEmpty())
                System.out.println("Розыгрыш окончен, игрушек больше нет");
        }

    }

}
