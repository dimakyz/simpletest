import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //прямоугольник 1-е задание
        Rect rect = new Rect(4, 5);
        System.out.println("площадь прямоугольника = " + rect.getArea());
        System.out.println("периметр прямоугольника = " + rect.getPerim());
        //квадрат 2-е задание
        Square square = new Square(10, 10);
        System.out.println("площадь квадрата = " + square.getArea());
        System.out.println("периметр квадрата = " + square.getPerim());
        //3-е задание
        System.out.println("Исходная строка = abcdefg123");
        System.out.println("После переворачивания = " + reverse("abcdefg123"));
        //4-е задание Сортировка пузырьком
        int[] array = {4, 6, 8, 1, 3, 9, 2, 8, 7, 2, 9, 4, 4, 5, 7};
        System.out.println("Исходная массив = " + Arrays.toString(array));
        bubbleSort(array);
        System.out.println("После сортировки = " + Arrays.toString(array));
        //5-е задание Поиск максимального эл-та в массиве
        int[] arr = {4, 6, 8, 1, 3, 9, 2, 8, 7, 2, 9, 4, 4, 5, 7};
        int maxIndex = 0;
        for (int i = 1; i < arr.length; i++)
        {
            if (arr[i] > arr[maxIndex])
            {
                maxIndex = i;
            }
        }
        System.out.println("Индекс максимального значения = " + maxIndex);
        //6-е задание работа с файлами
        String text = "Some text";
        //запись в файл
        try(FileOutputStream fos = new FileOutputStream("C://21//file.txt"))
        {
            // перевод строки в байты
            byte[] buffer = text.getBytes();
            fos.write(buffer, 0, buffer.length);
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
        //чтение из файла
        try(FileInputStream fin = new FileInputStream("C://21//file.txt"))
        {
            int i = -1;
            System.out.print("Данные файла: ");
            while((i=fin.read())!= -1){
                System.out.print((char)i);
            }
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
    }

    //метод переводрачивания строки
    private static String reverse(String str) {
        int strLength = str.length();
        StringBuffer result = new StringBuffer();
        for (int i = 0; i < strLength; i++) {
            result.insert(0, str.charAt(i));
        }
        return result.toString();
    }

    //сотрировка пузырьком
    private static void bubbleSort(int[] arr) {
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int buf = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = buf;
                }
            }
        }
    }
}