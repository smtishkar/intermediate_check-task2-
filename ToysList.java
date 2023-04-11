public class ToysList {

    public static Object toy1;
    public String id;
    public String name;
    public float chance;

    public ToysList(String id, String name, int chance) {
        this.id = id;
        this.name = name;
        this.chance = chance;

    }

    @Override
    public String toString() {
        // return "ID: " + this.id + " ; Name: %10d" + this.name + " ; Chance " +
        // this.chance;
        return String.format("ID: %10s | Name: %15s | Chance: %f", id, name, chance);
    }

    public float getChance() {
        return chance;
    }

    public void setChance(float chance) {
        this.chance = chance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}
