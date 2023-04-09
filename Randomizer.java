import java.util.List;

public class Randomizer {
    public ToysList chooseChance(List<ToysList> lisOfToys) {
        double starChance = 0.0;
        for (ToysList toy : lisOfToys)
            starChance += toy.getChance();
        double result = Math.random() * starChance;
        double finChance = 0.0;
        for (ToysList toy : lisOfToys) {
            finChance += toy.getChance();
            if (finChance >= result)
                return toy;
        }
        throw new RuntimeException("Should never be shown.");
    }

}
