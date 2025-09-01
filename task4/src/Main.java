import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.print("Input X: ");
        int x = in.nextInt();
        System.out.print("Input Y: ");
        int y = in.nextInt();
        System.out.print("Input Z: ");
        int z = in.nextInt();
        float ar = (float) (x + y + z) /3;
        System.out.println("Среднее арифметическое = "+ar);
        ar /=2;
        int result = (int) ar;
        System.out.println("С = "+result);
        if (ar > 3)
            System.out.println("Программа выполнена корректно");
    }
}