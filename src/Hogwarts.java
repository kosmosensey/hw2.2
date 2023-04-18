public class Hogwarts {
    private String name;
    private int powerOfSorcery;
    private int transgressingDistance;

    public Hogwarts(String name, int powerOfSorcery, int transgressingDistance) {
        this.name = name;
        this.powerOfSorcery = powerOfSorcery;
        this.transgressingDistance = transgressingDistance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPowerOfSorcery() {
        return powerOfSorcery;
    }

    public void setPowerOfSorcery(int powerOfSorcery) {
        this.powerOfSorcery = powerOfSorcery;
    }

    public int getTransgressingDistance() {
        return transgressingDistance;
    }

    public void setTransgressingDistance(int transgressingDistance) {
        this.transgressingDistance = transgressingDistance;
    }
}
