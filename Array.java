import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Array implements IShow {
    String info;
    int size;

    @Override
    public void print() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество элементов массива");
        int size = Integer.parseInt(scanner.nextLine());
        int[] array = new int[size];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100 + 100) - 100;
            System.out.println(array[i]);
        }
    }

    @Override
    public void print(String info) {
        print();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Введите комментарий");
        info=scanner.nextLine();
        System.out.println(info);
     scanner.close();
    }

}