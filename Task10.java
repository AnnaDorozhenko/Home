import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество элементов массива");
        int size = Integer.parseInt(scanner.nextLine());
        int[] array = new int[size];
        final int[] array1 = arrayR(size);
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array1)+"Массив из четных чисел: "+Arrays.toString(Task10.evenArray(array1,size)));
        System.out.println(Arrays.toString(array1)+"Массив из нечетных чисел: "+Arrays.toString(Task10.oddArray(array1,size)));
        System.out.println(Arrays.toString(array1)+"Массив из отрицательных чисел: "+Arrays.toString(Task10.negativeArray(array1,size)));
        System.out.println(Arrays.toString(array1)+"Массив из положительных чисел: "+Arrays.toString(Task10.positiveArray(array1,size)));
    }

    public static int[] arrayR(int size) {
        int[] array = new int[size];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {

            array[i] = random.nextInt(100 + 100) - 100;

        }
        return array;
    }
    public static int [] evenArray(int [] array1, int size)
    {
        int [] even =new int[size];
        for (int i = 0; i < array1.length; i++) {
            if (array1[i]%2==0)
            {
             even[i]=array1[i];
            }
        } return even;
    }

    public static int [] oddArray(int [] array1, int size)
    {
        int [] even =new int[size];
        for (int i = 0; i < array1.length; i++) {
            if (array1[i]%2!=0)
            {
                even[i]=array1[i];
            }
        } return even;
    }

    public static int [] negativeArray(int [] array1, int size)
    {
        int [] even =new int[size];
        for (int i = 0; i < array1.length; i++) {
            if (array1[i]<0)
            {
                even[i]=array1[i];
            }
        } return even;
    }
    public static int [] positiveArray(int [] array1, int size)
    {
        int [] even =new int[size];
        for (int i = 0; i < array1.length; i++) {
            if (array1[i]>0)
            {
                even[i]=array1[i];
            }
        } return even;
    }
}