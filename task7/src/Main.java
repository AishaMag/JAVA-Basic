import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int x = 35;
        int y = 28;
        int z = 96;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива:");
        int a = in.nextInt();
        int count = 0;
        for (int i = 0;i<a;i++){
            System.out.println("Число "+i+" = ");
            int temp = in.nextInt();
            if ((temp == x) || (temp == y) || (temp == z))
                count++;
        }
        if (count >= 1)
            System.out.println("Данное значение имеется в константах");
    }
}