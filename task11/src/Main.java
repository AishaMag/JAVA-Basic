import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку:");
        String str = in.nextLine();
        System.out.println("Введите число:");
        int a = in.nextInt();

        int str1 = Integer.parseInt(str);
        System.out.println("Большее число = "+Math.max(a,str1));
        double min = Math.min(a,str1);
        System.out.println("Большее число = "+min);
    }
}