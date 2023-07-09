public class Main {
    public static void main(String[] args) {
        Grifidor[] grifidors = {
                new Grifidor("Гарри Поттер", 80, 80, 100, 100, 100),
                new Grifidor("Гермиона Грейнджер", 99, 71, 100, 70, 75),
                new Grifidor("Рон Уизли", 70, 68, 100, 60, 50)
        };
        Slytherin[] slytherins = {
                new Slytherin("Драко Малфой", 75, 64, 40, 28, 24, 68, 100),
                new Slytherin("Грэхэм Монтегю", 56, 45, 75, 42, 71, 34, 59),
                new Slytherin("Грегори Гойл", 67, 42, 76, 48, 12, 56, 76),
        };
        Hufflepuff[] hufflepuffs = {
                new Hufflepuff("Захария Смит", 21, 24, 54, 2, 67),
                new Hufflepuff("Седрик Диггори", 68, 76, 23, 64, 42),
                new Hufflepuff("Джастин Финч-Флетчли", 44, 23, 43, 54, 89)
        };
        Ravenclaw[] ravenclaws = {
                new Ravenclaw("Чжоу Чанг", 46, 65, 21, 24, 65, 99),
                new Ravenclaw("Падма Патил", 23, 52, 56, 21, 34, 65),
                new Ravenclaw("Маркус Белби", 23, 52, 21, 52, 63, 12)
        };
        System.out.println("Грифиндор");
        Grifidor.print(grifidors);
        System.out.println("Пуффендуй");
        Hufflepuff.print(hufflepuffs);
        System.out.println("Когтевран");
        Ravenclaw.print(ravenclaws);
        System.out.println("Слизерин");
        Slytherin.print(slytherins);
        System.out.println("_ _ _ _ _ _ ");
        Grifidor.compareCharacteristic(grifidors);
        System.out.println("_ _ _ _ _ _ ");
        Hufflepuff.compareCharacteristic(hufflepuffs);
        System.out.println("_ _ _ _ _ _ ");
        Ravenclaw.compareCharacteristic(ravenclaws);
        System.out.println("_ _ _ _ _ _ ");
        Slytherin.compareCharacteristic(slytherins);
        System.out.println("_ + _ + _ + _ + _ + _ + _ + _ + _ + _ + ");
//      printService.comparePowerPoints(grifidors, slytherins, hufflepuffs, ravenclaws);
        Grifidor student = grifidors[0];
        student.compareWith(slytherins[0]);
    }
}