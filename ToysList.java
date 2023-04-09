public class ToysList {

    public static Object toy1;
    public int id;
    public String name;
    public double chance;

    public ToysList (int id, String name, double chance) {
            this.id = id;
            this.name = name;
            this.chance = chance;

        }

        
    @Override
    public String toString(){
        return this.id + " " + this.name + " " + this.chance;
    }

    public double getChance(){
        return chance;
    }


    
    


}
