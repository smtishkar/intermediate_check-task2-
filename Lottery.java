public class Lottery {

    // public class ToyStore {
    //     private ArrayList<ToysList> listOfToys;
    
    //     public ToyStore(List<Toy> toys) {
    //         this.toys = toys;
    //     }
    // }



    public ToysList resultOfLottery() {
        Randomizer random = new Randomizer();
        ToysList toy = random.chooseChance(null);
        return toy;
    }


    public void writeInFile(){
    }
}
