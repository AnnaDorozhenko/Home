import java.util.Arrays;
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        int numStart;
        int numEnd;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите стартовое число");
        numStart = Integer.parseInt(scanner.nextLine());
        System.out.println("Введите конечно число");
        numEnd = Integer.parseInt(scanner.nextLine());
        if(numStart<numEnd)
        {
            System.out.println(Arrays.toString(Task7.array(numStart, numEnd)));
        }
        if(numStart>numEnd)
        {
            System.out.println(Arrays.toString(Task7.array1(numStart, numEnd)));
        }


    }

    public static int[] array(int numStart, int numEnd) {

        int[] number = new int[numEnd - numStart];

               for (int i = 0; i <number.length; i++) {

                   if(i%2!=0)
                   {
                       number[i]=i;
                   }

        } return number;
    }

    public static int[] array1(int numStart, int numEnd) {

        int[] number = new int[numStart - numEnd];

        for (int i = 0; i <number.length; i++) {

            if(i%2!=0)
            {
                number[i]=i;
            }

        } return number;
    }


}