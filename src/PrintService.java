import java.util.Random;

public class PrintService {
    public void print(Grifidor[] grifidors) {
        for (Grifidor grifidor : grifidors) {
            System.out.println("Имя " + grifidor.getName() +
                    "; Сила магии - " + grifidor.getPowerOfSorcery() +
                    "; Расстояние трансгресии - " + grifidor.getTransgressingDistance() +
                    "; благородство - " + grifidor.getNobility() +
                    "; честь - " + grifidor.getHonor() +
                    "; храбрость - " + grifidor.getCourage() + ";");
        }
    }

    public void print(Hufflepuff[] hufflepuffs) {
        for (Hufflepuff hufflepuff : hufflepuffs) {
            System.out.println("Имя " + hufflepuff.getName() +
                    "; Сила магии - " + hufflepuff.getPowerOfSorcery() +
                    "; Расстояние трансгресии - " + hufflepuff.getTransgressingDistance() +
                    "; трудолюбивость - " + hufflepuff.getHardworking() +
                    "; верность - " + hufflepuff.getLoyalty() +
                    "; честность - " + hufflepuff.getHonesty() + ";");
        }
    }

    public void print(Ravenclaw[] ravenclaws) {
        for (Ravenclaw ravenclaw : ravenclaws) {
            System.out.println("Имя " + ravenclaw.getName() +
                    "; Сила магии -" + ravenclaw.getPowerOfSorcery() +
                    "; Расстояние трансгресии - " + ravenclaw.getTransgressingDistance() +
                    "; ум -" + ravenclaw.getIntellect() +
                    "; мудрость - " + ravenclaw.getWisdom() +
                    "; остроумие - " + ravenclaw.getWit() +
                    "; творчество - " + ravenclaw.getCreativity() + ";");
        }
    }

    public void print(Slytherin[] slytherins) {
        for (Slytherin slytherin : slytherins) {
            System.out.println("Имя " + slytherin.getName() +
                    "; Сила магии - " + slytherin.getPowerOfSorcery() +
                    "; Расстояние трансгресии - " + slytherin.getTransgressingDistance() +
                    "; хитрость - " + slytherin.getTrick() +
                    "; решительность - " + slytherin.getDetermination() +
                    "; амбициозность - " + slytherin.getAmbition() +
                    "; находчивость - " + slytherin.getResourcefulness() +
                    "; жажда власти - " + slytherin.getThirstForPower() + ";");
        }
    }

    public void compareFacultyScore(Grifidor[] grifidor) {
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

    public void compareFacultyScore(Hufflepuff[] hufflepuffs) {
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

    public void compareFacultyScore(Ravenclaw[] ravenclaws) {
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

    public void compareFacultyScore(Slytherin[] slytherins) {
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

    public void comparePowerPoints(Grifidor[] grifidors, Slytherin[] slytherins, Hufflepuff[] hufflepuffs, Ravenclaw[] ravenclaws) {
        Random random = new Random();
        int randomIndex1 = random.nextInt(4); // генерация случайного числа для определения факультета
        int randomIndex2 = random.nextInt(4); // генерация второго случайного числа для определения факультета
        int i = random.nextInt(2); // генерация первого случайного числа для ученика
        int j;
        do {
            j = random.nextInt(2); // генерация второго случайного числа для ученика
        } while (i == j);
        Hogwarts student1 = new Hogwarts(null, 0, 0);
        Hogwarts student2 = new Hogwarts(null, 0, 0);
        switch (randomIndex1) {
            case 0 -> student1 = grifidors[i];
            case 1 -> student1 = hufflepuffs[i];
            case 2 -> student1 = ravenclaws[i];
            case 3 -> student1 = slytherins[i];
        }
        switch (randomIndex2) {
            case 0 -> student2 = grifidors[j];
            case 1 -> student2 = hufflepuffs[j];
            case 2 -> student2 = ravenclaws[j];
            case 3 -> student2 = slytherins[j];
        }
        if (student1.getPowerOfSorcery()+student1.getTransgressingDistance() > student2.getPowerOfSorcery()+student2.getTransgressingDistance()){
            System.out.println("У " + student1.getName() + " магия сильнее, чем у " + student2.getName());
        } else {
            System.out.println("У " + student2.getName() + " магия сильнее, чем у " + student1.getName());
        }
    }
}
