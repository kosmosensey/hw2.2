public class Hufflepuff extends Hogwarts{
    private int hardworking;
    private int loyalty;
    private int honesty;

    public Hufflepuff(String name, int powerOfSorcery, int transgressingDistance, int hardworking, int loyalty, int honesty) {
        super(name,powerOfSorcery,transgressingDistance);
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
}
