public class Hufflepuff extends Hogwarts {
    private int hardworking;
    private int loyalty;
    private int honesty;

    public Hufflepuff(String name, int powerOfSorcery, int transgressingDistance, int hardworking, int loyalty, int honesty) {
        super(name, powerOfSorcery, transgressingDistance);
        this.hardworking = hardworking;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getHardworking() {
        return hardworking;
    }

    public void setHardworking(int hardworking) {
        this.hardworking = hardworking;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    @Override
    public String toString() {
        return "Имя " + getName() +
                "; Сила магии - " + getPowerOfSorcery() +
                "; Расстояние трансгресии - " + getTransgressingDistance() +
                "; трудолюбивость - " + hardworking +
                "; верность - " + loyalty +
                "; честность - " + honesty +
                ';';
    }

    public static void print(Hufflepuff[] hufflepuffs) {
        for (Hufflepuff hufflepuff : hufflepuffs) {
            System.out.println(hufflepuff);
        }
    }

    public static void compareCharacteristic(Hufflepuff[] hufflepuffs) {
        Hufflepuff student1 = hufflepuffs[0];
        Hufflepuff student2 = hufflepuffs[2];
        System.out.println("У " + student1.getName() +
                "; трудолюбивость - " + student1.getHardworking() +
                "; верность - " + student1.getLoyalty() +
                "; честность - " + student1.getHonesty() + ";");
        System.out.println("vs");
        System.out.println("У " + student2.getName() +
                "; трудолюбивость - " + student2.getHardworking() +
                "; верность - " + student2.getLoyalty() +
                "; честность - " + student2.getHonesty() + ";");
        if (student1.getHardworking() + student1.getLoyalty() + student1.getHonesty() > student2.getHardworking() + student2.getLoyalty() + student2.getHonesty()) {
            System.out.println(student1.getName() + " лучше " + student2.getName());
        } else {
            System.out.println(student2.getName() + " лучше " + student1.getName());
        }
    }
    public int ability(Hufflepuff[] hufflepuffs) {
        return getPowerOfSorcery() + getTransgressingDistance();
    }
}
