import java.util.Arrays;

public class Grifidor extends Hogwarts {
    private int nobility;
    private int honor;
    private int courage;

    public Grifidor(String name, int powerOfSorcery, int transgressingDistance, int nobility, int honor, int courage) {
        super(name, powerOfSorcery, transgressingDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.courage = courage;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getCourage() {
        return courage;
    }

    public void setCourage(int courage) {
        this.courage = courage;
    }

    @Override
    public String toString() {
        return "Имя " + getName() +
                "; Сила магии - " + getPowerOfSorcery() +
                "; Расстояние трансгресии - " + getTransgressingDistance() +
                "; благородство - " + nobility +
                "; честь - " + honor +
                "; храбрость - " + courage +
                ';';
    }

    public static void print(Grifidor[] grifidors) {
        for (Grifidor grifidor : grifidors) {
            System.out.println(grifidor);
        }
    }

    public static void compareCharacteristic(Grifidor[] grifidor) {
        Grifidor student1 = grifidor[1];
        Grifidor student2 = grifidor[2];
        System.out.println("У " + student1.getName() +
                "; благородство - " + student1.getNobility() +
                "; честь - " + student1.getHonor() +
                "; храбрость - " + student1.getCourage() + ";");
        System.out.println("vs");
        System.out.println("У " + student2.getName() +
                "; благородство - " + student2.getNobility() +
                "; честь - " + student2.getHonor() +
                "; храбрость - " + student2.getCourage() + ";");
        if (student1.getCourage() + student1.getHonor() + student1.getNobility() > student2.getCourage() + student2.getHonor() + student2.getNobility()) {
            System.out.println(student1.getName() + " лучше " + student2.getName());
        } else {
            System.out.println(student2.getName() + " лучше " + student1.getName());
        }
    }

    public int ability() {
        return getPowerOfSorcery() + getTransgressingDistance();
    }
    public void compareWith(Slytherin otherStudent) {
        int otherAbility = otherStudent.getPowerOfSorcery() + otherStudent.getTransgressingDistance();
        if (ability() > otherAbility) {
            System.out.println("У " + getName() + " магия сильнее, чем у " + otherStudent.getName());
        } else if (ability() < otherAbility) {
            System.out.println("У " + otherStudent.getName() + " магия сильнее, чем у " + getName());
        } else {
            System.out.println("У обоих студентов одинаковые способности.");
        }
    }
}
