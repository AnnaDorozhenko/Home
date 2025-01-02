import java.util.Arrays;
import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        int size;
        int vector;
        char symbol;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество элементов массива");
        size = Integer.parseInt(scanner.nextLine());
        System.out.println("Введите символ");
        symbol = scanner.nextLine().charAt(0);
        System.out.println("Введите направление: 1-горизонтально, 2-вертикально");
        vector = Integer.parseInt(scanner.nextLine());
        switch (vector)
        {
            case 1:
                System.out.print(Task11.charText(size, symbol));
                break;
            case 2:
                System.out.println(Task11.charText1(size, symbol));
                break;
        }

    }
    public static String charText(int size, char symbol)
    {
        String text = " ";
        for (int i = 0; i <size ; i++) {
           text+=symbol+" ";
        }
        return text;
    }
    public static String charText1(int size, char symbol)
    {
        String text = " ";
        for (int i = 0; i <size ; i++) {
            text+=symbol+"\n";
        }
        return text;
    }

}
