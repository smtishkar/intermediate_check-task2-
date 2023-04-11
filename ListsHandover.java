import java.util.ArrayList;
import java.util.Random;

public class ListsHandover {

    /**
     * Метод создает список игрушек, который будет участвовать в лотерее
     * 
     * @param listOfToys подаем на вход пустой лист
     */
    static void createListOfToys(ArrayList listOfToys, int numberofToys) {
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


    /**
     * Метод для клонирования исходного списка игрушек
     * @param list - на вход подаем исходный список игрушек
     * @return - на выходе получаем дубликат списка
     */
    public static ArrayList<ToysList> clonListOfToys(ArrayList<ToysList> list) {
        ArrayList<ToysList> clone = new ArrayList<ToysList>(list.size());
        clone.addAll(list);
        return clone;
    }

}
