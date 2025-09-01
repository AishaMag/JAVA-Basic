import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.print("Введите первое число: ");
        int a = in.nextInt();
        System.out.print("Введите второе число: ");
        int b = in.nextInt();
        System.out.print("Введите оператор: ");
        char op = in.next().charAt(0);
        int result = 0;
        switch(op) {
            case '+':
                result = a+b;
                break;
            case '-':
                result = a-b;
                break;
            case '*':
                result = a*b;
                break;
            case '/':
                result = a/b;
                break;
        }
        System.out.println("Ответ = "+result);
    }
}