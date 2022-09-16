import java.util.InputMismatchException;
import java.util.Scanner;

public class MainApp1 {
    public static void main(String[] args) {
        String[][] arr = new String[][]{{"1","2","3","9","7"},//Задание 3
                                        {"2","3","4","8","6"},
                                        {"3","4","5","h","4"},
                                        {"4","5","6"},
                                        {"5","6","7","1","0"}};
        System.out.println(sum2d(arr));
    }

    /*Scanner scanner = new Scanner(System.in);//Задание 1 (Задача)
        int[] arr = new int[10];
        System.out.println("Укажите индекс элемента массива, в который хотите вписать значение 1");
        int index = scanner.nextInt();
        try {
            arr[index] = 1;
        } catch (Exception e) {
            System.out.println("Указан индекс за пределами массива");
        }*/

    /*Решение*/
    public static void assignAnIndex (){
    Scanner scanner = new Scanner(System.in);//Решение
    int[] arr = new int[10];
        System.out.println("Укажите индекс элемента массива, в который хотите вписать значение 1");
    int index = 0;
    boolean isCorrect = false;
        do {
        try {
            index = scanner.nextInt();
            if (index >= 0 && index < arr.length){
                arr[index] = 1;
                isCorrect = true;
                System.out.println("Действие выполнено!");
            } else {
                isCorrect = false;
                System.out.println("Индекс находится за пределами массива");
            }
        } catch (InputMismatchException ex) {
            System.out.println("Указан не число");
            isCorrect = false;
            String line = scanner.nextLine();
        }
    } while (!isCorrect);
        scanner.close();
    }

    /*Задание 2*/
    public static int userNumber(){
    Scanner scanner1 = new Scanner(System.in);
        System.out.println("Введите число");
        int a = 0;
        while (true){
            try {
               a = scanner1.nextInt();
               System.out.println("Ваше число " + a);
            } catch (InputMismatchException ex) {
               System.out.println("Указан не число, введите число");
               String line = scanner1.nextLine();
            }
        }
    }

    /*Задание 3*/
    public static int sum2d(String[][] arr){
        int sum = 0;
        for (int i = 0; i <arr.length; i++){
            for (int j = 0; j < 5; j++){
                try {
                     int val = Integer.parseInt(arr[i][j]);
                     sum += val;
                } catch (NumberFormatException e){

                } catch (IndexOutOfBoundsException e){

                }
            }
        } return sum;
    }

}
