import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число:");
        int a = in.nextInt();
        if(a % 2 == 0) a--;
        int sum = 0;
        while (a>0){
            sum+=a;
            a-=2;
        }
        System.out.println("Сумма:"+sum);
    }
}