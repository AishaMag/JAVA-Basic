import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Scanner inint = new Scanner(System.in);
        System.out.println("Введите размер массива:");
        int length = inint.nextInt();
        double [] array = new double[length];
        double sum = 0.0;
        for (int i = 0; i < length; i++) {
            System.out.print("array[" + i + "] = ");
            array[i] = in.nextDouble();
            sum+=array[i];
        }
        for (int i = 0; i < length; i++) {
            System.out.println("array[" + i + "] = "+ array[i]*(sum/length));
        }
    }
}