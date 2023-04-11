import java.util.ArrayList;

public class Lottery {

    /**
     * Метод который реализует розыгрыш, т.е. вытаскивает игрушку и удаляет ее из общего списка
     * @param numberofToys - общее количество игрушек, которое участвует в розыгрыше
     * @param newlistOfToys - клонированный список (в него вносятся изменения)
     */
    public static void lotteryProcess(int numberofToys, ArrayList<ToysList> newlistOfToys) {
        for (int i = 0; i < numberofToys; i++) {
            ToysList item = (Randomizer.chooseChance(newlistOfToys));
            Logger.logToFile(item.toString());
            System.out.println("Выпала игрушка --> " + item);
            newlistOfToys.remove(item);
            if (newlistOfToys.isEmpty())
                System.out.println("Розыгрыш окончен, игрушек больше нет");
        }
    }

}
