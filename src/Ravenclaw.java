public class Ravenclaw extends Hogwarts {
    private int intellect;
    private int wisdom;
    private int wit;
    private int creativity;

    public Ravenclaw(String name, int powerOfSorcery, int transgressingDistance, int intellect, int wisdom, int wit, int creativity) {
        super(name, powerOfSorcery, transgressingDistance);
        this.intellect = intellect;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    public int getIntellect() {
        return intellect;
    }

    public void setIntellect(int intellect) {
        this.intellect = intellect;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }

    @Override
    public String toString() {
        return "Имя " + getName() +
                "; Сила магии -" + getPowerOfSorcery() +
                "; Расстояние трансгресии - " + getTransgressingDistance() +
                "; ум -" + intellect +
                "; мудрость - " + wisdom +
                "; остроумие - " + wit +
                "; творчество - " + creativity +
                ';';
    }

    public static void print(Ravenclaw[] ravenclaws) {
        for (Ravenclaw ravenclaw : ravenclaws) {
            System.out.println(ravenclaw);
        }
    }

    public static void compareCharacteristic(Ravenclaw[] ravenclaws) {
        Ravenclaw student1 = ravenclaws[0];
        Ravenclaw student2 = ravenclaws[1];
        System.out.println("У " + student1.getName() +
                "; ум -" + student1.getIntellect() +
                "; мудрость - " + student1.getWisdom() +
                "; остроумие - " + student1.getWit() +
                "; творчество - " + student1.getCreativity() + ";");
        System.out.println("vs");
        System.out.println("У " + student2.getName() +
                "; ум -" + student2.getIntellect() +
                "; мудрость - " + student2.getWisdom() +
                "; остроумие - " + student2.getWit() +
                "; творчество - " + student2.getCreativity() + ";");
        if (student1.getIntellect() + student1.getWisdom() + student1.getWit() + student2.getCreativity() > student2.getIntellect() + student2.getWisdom() + student2.getWit() + student2.getCreativity()) {
            System.out.println(student1.getName() + " лучше " + student2.getName());
        } else {
            System.out.println(student2.getName() + " лучше " + student1.getName());
        }
    }
    public int ability(Slytherin[] slytherins) {
        return getPowerOfSorcery() + getTransgressingDistance();
    }
}
