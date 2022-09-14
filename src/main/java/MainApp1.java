import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class MainApp1 {
    public static void main(String[] args) {
        //№1
        recursionFunc();
        recordFile("123","Hello World");
        equalsInteger(125, "12");

        //№2
        String[][] arr = new String[][]{{"1","2","2","2","1"},
                                        {"b","a","c","d","e"},
                                        {"4","6","7","2","1"}};
        System.out.println(sum2d(arr));

        //№3
        int[] arr1 = new int[]{9,8,7,6,5};
        int[] arr2 = new int[]{1,2,3,4,0};
        int[] result = arrayDifference(arr1, arr2);
        String resultAsString = Arrays.toString(result);
        System.out.println(resultAsString);

        //№4
        Integer[] arr3 = new Integer[]{9,8,7,6,5};
        Integer[] arr4 = new Integer[]{1,2,3,4,null};
        Integer[] result2 = arrayDivision(arr3, arr4);
        String resultAsString2 = Arrays.toString(result2);
        System.out.println(resultAsString2);
    }
    /*Задание 1*/
    public static void recursionFunc(){//Вызов  бесконечной рекурсии, ошибка - переполнение стека
        System.out.println("Hello world!");
        recursionFunc();
    }

    public static void recordFile(File file, String str) throws IOException {//Запись текста в файл,
        FileWriter writer = new FileWriter(file);                            //ошибка - файл отсутствует
        String text = str;
        writer.write(text);
    }

    public static boolean equalsInteger(Integer a, Integer b) {//Сравнение объектов
        if (a == b) {                                 //ошибки - вместо Integer переданы строка или null
            return true;
        }
        return false;
    }

    /*Задание 2*/
    public static int sum2d(String[][] arr) {//Возможные исключения: ArrayIndexOutOfBoundsException (если вложенный массив меньше 5)
        int sum = 0;                         //NumberFormatException (если передана строка которую нельзя преобразовать в число)
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < 5; j++) {
                int val = Integer.parseInt(arr[i][j]);
                sum += val;
            }
        }
        return sum;
    }

    /*Задание 3*/
    public static int[] arrayDifference(int[] arr1,int[] arr2){
        if (arr1.length != arr2.length){
            throw new RuntimeException("Array have different");
        }
        int[] result = new int[arr1.length];
        for (int i = 0; i < result.length; i++){
            result[i] = arr1[i] - arr2[i];
        }
        return result;
    }

    /*Задание 4*/
    public static Integer[] arrayDivision(Integer[] arr1, Integer[] arr2){
        for (Integer el : arr1){
            if (el == null){
                throw new RuntimeException("There is null element in array 1");
            }
        }
        for (Integer el : arr2){
            if (el == null){
                throw new RuntimeException("There is null element in array 2");
            }
        }
        if (arr1.length != arr2.length){
            throw new RuntimeException("Array have different");
        }
        Integer[] result = new Integer[arr1.length];
        for (int i = 0; i < result.length; i++){
            if (arr2[i] == 0){
                throw new RuntimeException("Attempt to divide by 0");
            }
            result[i] = arr1[i] / arr2[i];
        }
        return result;
    }
}
