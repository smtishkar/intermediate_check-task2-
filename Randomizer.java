import java.util.ArrayList;

public class Randomizer {

    /**
     * Метод выбирает случайным образом игрушку из списка принимая во внимает вес/шанс выпадения 
     * игрушки, т.е. реализация алгоритма средневзвешенной вероятности.
     * @param newlistOfToys - клонированный список
     * @return - игрушку которая "попалась"
     */

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
        throw new RuntimeException("Что-то пошло не так. Меня не должно появляться");
    }

    // Оставил для себя, чтобы не забыть :)

    // public static int ttlProbabilityCalculation(ArrayList<ToysList>
    // initialListOfToys) {
    // int ttlChance = 0;
    // for (ToysList toy : initialListOfToys) {
    // ttlChance += ((int) toy.getChance());
    // }
    // return ttlChance;
    // }

    // public static void weigedProbabilityCalculation(ArrayList<ToysList>
    // initialListOfToys, int ttlChance) {
    // float result = 0;
    // for (ToysList toy : initialListOfToys) {
    // result = (((float) toy.getChance()) / ((float) ttlChance));
    // toy.setChance(result);
    // ;
    // }
    // }

    // public static int secondTypeChanceCalculation(ArrayList<ToysList>
    // initialListOfToys) {
    // int ttlChance = 0;
    // for (ToysList toy : initialListOfToys) {
    // ttlChance += ((int) toy.getChance());
    // System.out.println(ttlChance);
    // }
    // return ttlChance;

    // }

}
