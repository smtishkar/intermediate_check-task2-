import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * program
 */
public class program {

    static final int numberofToys = 10;
    public static ArrayList<ToysList> listOfToys = new ArrayList<>();
    public static void main(String[] args) {
        
        ToysList toy1 = new ToysList(1, "Машинка", 30);
        ToysList toy2 = new ToysList(2, "Конструктор", 40);
        ToysList toy3 = new ToysList(3, "Робот", 50);
        ToysList toy4 = new ToysList(4, "Мягкая игрушка", 20);

        // List<ToysList> listOfToys = new ArrayList<ToysList>();
        // listOfToys.add(toy1);
        // listOfToys.add(toy2);
        // listOfToys.add(toy3);
        // listOfToys.add(toy4);


        // System.out.println(listOfToys.toString());
        createListOfToys(listOfToys);
        listOfToys.forEach(n -> System.out.println(n.toString()));
        
    

    }

    static void createListOfToys(ArrayList listOfToys){
        for (int i = 0; i < numberofToys; i++) {
            switch (new Random().nextInt(4)) {
                case 0:
                    listOfToys.add(new ToysList(1, "Машинка", 30));
                    break;
                case 1:
                    listOfToys.add(new ToysList(2, "Конструктор", 40));
                    break;
                case 2:
                    listOfToys.add(new ToysList(2, "Робот", 50));
                    break;
                case 3:
                    listOfToys.add(new ToysList(2, "Мягкая игрушка", 20));
                    break;
                default:
                    break;
            }
        }
    }



}