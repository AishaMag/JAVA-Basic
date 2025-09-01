import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("1 - Масса или 2 - Расстояние?");
        int a = in.nextInt();
        if (a == 2) {
            System.out.println("1 - метр, 2 - миля, 3 - ярд, 4 - фут");
            int b = in.nextInt();
            System.out.println("Введите число: ");
            int c = in.nextInt();
            switch (b) {
                case 1:
                    System.out.println("Метры = " + c);
                    System.out.println("Мили = " + c * 0.000621);
                    System.out.println("Ярд = " + c * 1.09);
                    System.out.println("Фут = " + c * 3.28);
                    break;
                case 2:
                    System.out.print("Метры = " + c * 1609.34);
                    System.out.print("Мили = " + c);
                    System.out.print("Ярд = " + c * 1760);
                    System.out.print("Фут = " + c * 5280);
                    break;
                case 3:
                    System.out.print("Метры = " + c * 0.9144);
                    System.out.print("Мили = " + c * 0.000568);
                    System.out.print("Ярд = " + c);
                    System.out.print("Фут = " + c * 3);
                    break;
                case 4:
                    System.out.print("Метры = " + c * 0.3048);
                    System.out.print("Мили = " + c * 0.000189);
                    System.out.print("Ярд = " + c * 0.33);
                    System.out.print("Фут = " + c);
                    break;
            }
        } else {
            if (a == 1) {
                System.out.println("1 - Грамм, 2 - Кг, 3 - Центнер, 4 - Тонна");
                int b = in.nextInt();
                System.out.println("Введите число: ");
                int c = in.nextInt();
                switch (b) {
                    case 1:
                        System.out.println("Грамм = " + c);
                        System.out.println("Кг = " + c * 0.001);
                        System.out.println("Центнер = " + c * 0.00001);
                        System.out.println("Тонн = " + c * 0.000001);
                        break;
                    case 2:
                        System.out.println("Грамм = " + c * 1000);
                        System.out.println("Кг = " + c);
                        System.out.println("Центнер = " + c * 0.01);
                        System.out.println("Тонн = " + c * 0.001);
                        break;
                    case 3:
                        System.out.println("Грамм = " + c * 100000);
                        System.out.println("Кг = " + c * 100);
                        System.out.println("Центнер = " + c);
                        System.out.println("Тонн = " + c * 0.1);
                        break;
                    case 4:
                        System.out.println("Грамм = " + c * 1000000);
                        System.out.println("Кг = " + c * 1000);
                        System.out.println("Центнер = " + c * 10);
                        System.out.println("Тонн = " + c);
                        break;
                }
            }
        }
    }
}