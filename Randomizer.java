import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.Random;

public class Randomizer {
    
    public static ToysList chooseChance(ArrayList<ToysList> newlistOfToys) {
    double starChance = 0.0;
    for (ToysList toy : newlistOfToys)
    starChance += toy.getChance();
    double result = Math.random() * starChance;
    double finChance = 0.0;
    for (ToysList toy : newlistOfToys) {
    finChance += toy.getChance();
    if (finChance >= result)
    return toy;
    }
    throw new RuntimeException("Should never be shown.");
    }



    public static int ttlProbabilityCalculation(ArrayList<ToysList> initialListOfToys) {
        int ttlChance = 0;
        for (ToysList toy : initialListOfToys) {
            ttlChance += ((int)toy.getChance());
            // System.out.println(ttlChance);
        }
        return ttlChance;
    }


    public static void weigedProbabilityCalculation(ArrayList<ToysList> initialListOfToys, int ttlChance) {
        float result = 0;
        for (ToysList toy : initialListOfToys) {
            result = (((float)toy.getChance()) / ((float)ttlChance));
            // System.out.println(toy.getChance());
            // System.out.println(ttlChance);
            // System.out.println(result);
            toy.setChance(result);;
        }
    }


    public static int secondTypeChanceCalculation(ArrayList<ToysList> initialListOfToys) {
        int ttlChance = 0;
        for (ToysList toy : initialListOfToys) {
            ttlChance += ((int)toy.getChance());
            System.out.println(ttlChance);
        }
        return ttlChance;

    }



    // public static void chanceCalculation(ArrayList<ToysList> newlistOfToys) {
    //     Random random = new Random();
    //     int x = random.nextInt(100);

    //     for (ToysList toy : newlistOfToys) {
    //         x = random.nextInt(100);
    //         int newChance = toy.getChance() * x;
    //         toy.setChance(newChance);
    //     }

    // }

}
