import java.io.File;
import java.io.IOException;
public class Test2
{
    public static void main(String[] args) {
        System.out.println("Test merge");
        try {
            File file = new File("test2.txt");
            if (file.createNewFile()) {
                System.out.println("Файл создан");
            } else {
                System.out.println("Файл уже существует");
            }
        } catch (IOException e) {
            System.out.println("Ошибка при создании файла");
            e.printStackTrace();
        }
    }
}
