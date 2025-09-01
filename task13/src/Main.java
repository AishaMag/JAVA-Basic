import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку:");
        String str = in.nextLine();
        String result = str.replaceAll("[0-9,а-я,А-Я]", "!");
        String[] result1 = result.split("!");
        System.out.println(result);
        int count = 0;
        for (int i = 0; i<result1.length;i++)
            if ((!Objects.equals(result1[i], " ")) && (!Objects.equals(result1[i], ""))) {
                System.out.print(result1[i]);
                count++;
            }
        System.out.println("\n" + count);
    }
}
