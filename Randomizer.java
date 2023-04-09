import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Randomizer {
    // public ToysList chooseChance(List<ToysList> lisOfToys) {
    // double starChance = 0.0;
    // for (ToysList toy : lisOfToys)
    // starChance += toy.getChance();
    // double result = Math.random() * starChance;
    // double finChance = 0.0;
    // for (ToysList toy : lisOfToys) {
    // finChance += toy.getChance();
    // if (finChance >= result)
    // return toy;
    // }
    // throw new RuntimeException("Should never be shown.");
    // }

    public static void chanceCalculation(ArrayList<ToysList> newlistOfToys) {
        Random random = new Random();
        int x = random.nextInt(100);

        for (ToysList toy : newlistOfToys) {
            x = random.nextInt(100);
            int newChance = toy.getChance() * x;
            toy.setChance(newChance);
        }

    }

}
