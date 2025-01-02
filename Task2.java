import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        int number;
        int percent;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Введите число");
        number=Integer.parseInt(scanner.nextLine());
        System.out.println("Введите процент");
        percent=Integer.parseInt(scanner.nextLine());
        System.out.printf("%d процентов от числа %d равно %d", percent, number, Task2.percent(number, percent));
    }

    public static int percent(int number, int percent)
    {

        return number*percent/100;
    }
}
