import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Введите количество элементов массива");
        int size=Integer.parseInt(scanner.nextLine());
        final int[]array1=arrayR(size);
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array1)+"Минимальное значение: "+Task9.min(array1));
        System.out.println(Arrays.toString(array1)+"Количество отрицательных чисел: "+Task9.countMin(array1));
        System.out.println(Arrays.toString(array1)+"Максимальное значение: "+Task9.max(array1));
        System.out.println(Arrays.toString(array1)+"Количество положительных чисел: "+Task9.countMax(array1));


    }
  public static int [] arrayR (int size){
        int[]array=new int[size];
        Random random=new Random();

       for (int i = 0; i < array.length; i++) {

       array[i]=random.nextInt(100+100)-100;

       } return array;
   }

   public static int min(int [] array1)
   {

       int min=array1[0];

       for (int i = 0; i < array1.length; i++) {

           if(array1[i]<min)
           {
               min=array1[i];
           }

       }return min;

   }
    public static int max(int [] array1)
    {

        int max=array1[0];

        for (int i = 0; i < array1.length; i++) {

            if(array1[i]>max)
            {
                max=array1[i];
            }

        }return max;
    }

   public static int countMin( int [] array1)
   {

       int countMin=0;
       for (int i = 0; i < array1.length; i++) {

           if (array1[i]<0)
           {
              countMin++;
           }
       }
       return countMin;

   }
    public static int countMax( int [] array1)
    {

        int countMax=0;
        for (int i = 0; i < array1.length; i++) {

            if (array1[i]>0)
            {
                countMax++;
            }
        }
        return countMax;

    }
}
