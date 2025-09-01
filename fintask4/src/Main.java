import java.util.Objects;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Загадка: Сидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает");
        String answer = in.nextLine();
        if (Objects.equals(answer, "Подсказка")) {
            System.out.println("Вирус");
            answer = in.nextLine();
            if (Objects.equals(answer, "Заархивированный вирус"))
                System.out.println("Правильно!");
            else System.out.println("Обидно, приходи в другой раз");
        } else if (Objects.equals(answer, "Заархивированный вирус"))
            System.out.println("Правильно!");
        else {
            System.out.println("Подумай еще!");
            answer = in.nextLine();
            if (Objects.equals(answer, "Подсказка")) System.out.println("Подсказка уже недоступна");
            if (Objects.equals(answer, "Заархивированный вирус"))
                System.out.println("Правильно!");
            else {
                System.out.println("Подумай еще!");
                answer = in.nextLine();
                if (Objects.equals(answer, "Подсказка")) System.out.println("Подсказка уже недоступна");
                if (Objects.equals(answer, "Заархивированный вирус"))
                    System.out.println("Правильно!");
                else System.out.println("Обидно, приходи в другой раз");
            }
        }
    }
}