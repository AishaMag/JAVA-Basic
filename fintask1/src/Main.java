import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите курс валют:");
        double kurs = in.nextDouble();
        System.out.println("Введите сумму:");
        double sum = in.nextDouble();

        System.out.println("Курс доллара: " + kurs);
        System.out.println("Количество рублей: " + sum);
        System.out.printf("Итого: %.2f долларов",kurs*sum);
    }
}