import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество строк:");
        int strk = in.nextInt();
        System.out.println("Введите количество столбцов:");
        int stlb = in.nextInt();
        int [][] array = new int[strk][stlb];
        for (int i = 0; i < strk; i++)
            for (int j = 0; j < stlb; j++) {
                System.out.print("array[" + i + "][" + j + "] = ");
                array[i][j] = in.nextInt();
            }
            for (int j = 0; j < stlb; j++)
                System.out.println("array[0][" + j + "] = " + array[0][j] * 3);
    }
}