public class ToysList {

    public static Object toy1;
    public int id;
    public String name;
    public int chance;

    public ToysList (int id, String name, int chance) {
            this.id = id;
            this.name = name;
            this.chance = chance;

        }

        
    @Override
    public String toString(){
        return this.id + " " + this.name + " " + this.chance;
    }

    public int getChance(){
        return chance;
    }


    public void setChance(int chance){
        this.chance = chance;
    }
  
    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }
    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }

}
