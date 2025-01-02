import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        double meters;
        int number;
        final double mile=0.00062;
        final double inch=39.37;
        final double yard=1.0936;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Введите длину в метрах");
        meters=Integer.parseInt(scanner.nextLine());
        System.out.println("Перевести метры в:\n 1-мили,\n 2-дюймы,\n 3-ярды");
        number=Integer.parseInt(scanner.nextLine());
        switch (number)
        {
            case 1:
                System.out.println(meters*mile);
                break;
            case 2:
                System.out.println(meters*inch);
                break;
            case 3:
                System.out.println(meters*yard);
                break;
            default:
                System.out.println("Неверно выбрано число перевода метров. Повторите попытку");
                main(args);
        }
    }
}
