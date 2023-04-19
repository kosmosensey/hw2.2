public class Slytherin extends Hogwarts {
    private int trick;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int thirstForPower;

    public Slytherin(String name, int powerOfSorcery, int transgressingDistance, int trick, int determination, int ambition, int resourcefulness, int thirstForPower) {
        super(name, powerOfSorcery, transgressingDistance);
        this.trick = trick;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.thirstForPower = thirstForPower;
    }

    public int getTrick() {
        return trick;
    }

    public void setTrick(int trick) {
        this.trick = trick;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getThirstForPower() {
        return thirstForPower;
    }

    public void setThirstForPower(int thirstForPower) {
        this.thirstForPower = thirstForPower;
    }

    @Override
    public String toString() {
        return "Имя " + getName() +
                "; Сила магии - " + getPowerOfSorcery() +
                "; Расстояние трансгресии - " + getTransgressingDistance() +
                "; хитрость - " + trick +
                "; решительность - " + determination +
                "; амбициозность - " + ambition +
                "; находчивость - " + resourcefulness +
                "; жажда власти - " + thirstForPower +
                ';';
    }

    public static void print(Slytherin[] slytherins) {
        for (Slytherin slytherin : slytherins) {
            System.out.println(slytherin);
        }
    }

    public static void compareCharacteristic(Slytherin[] slytherins) {
        Slytherin student1 = slytherins[0];
        Slytherin student2 = slytherins[1];
        System.out.println("У " + student1.getName() +
                "; хитрость - " + student1.getTrick() +
                "; решительность - " + student1.getDetermination() +
                "; амбициозность - " + student1.getAmbition() +
                "; находчивость - " + student1.getResourcefulness() +
                "; жажда власти - " + student1.getThirstForPower() + ";");
        System.out.println("vs");
        System.out.println("У " + student2.getName() +
                "; хитрость - " + student2.getTrick() +
                "; решительность - " + student2.getDetermination() +
                "; амбициозность - " + student2.getAmbition() +
                "; находчивость - " + student2.getResourcefulness() +
                "; жажда власти - " + student2.getThirstForPower() + ";");
        if (student1.getTrick() + student1.getDetermination() + student1.getAmbition() + student1.getResourcefulness() + student1.getThirstForPower() >
                student2.getTrick() + student2.getDetermination() + student2.getAmbition() + student2.getResourcefulness() + student2.getThirstForPower()) {
            System.out.println(student1.getName() + " лучше " + student2.getName());
        } else {
            System.out.println(student2.getName() + " лучше " + student1.getName());
        }
    }
    public int ability() {
        return getPowerOfSorcery() + getTransgressingDistance();
    }
}
