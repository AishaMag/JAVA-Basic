import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[15];
        for (int i = 1; i < 15; i++) {
            array[i] = random.nextInt(40)-20;
            System.out.println("i = " + i);
        }
    }
}