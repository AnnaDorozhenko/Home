import java.util.Arrays;
import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        int num1;
        int num2;


        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число №1");
        num1 = Integer.parseInt(scanner.nextLine());
        System.out.println("Введите число №2");
        num2 = Integer.parseInt(scanner.nextLine());
        for (int i = num1; i <= num2; i++) {
            for (int j = 1; j <= num2; j++) {
                System.out.print(i+"*"+j+"="+i*j+" ");
            }
            System.out.println(" ");

        }
    }


}
