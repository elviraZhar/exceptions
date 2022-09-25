package Lesson2;

import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

import static jdk.nashorn.internal.objects.Global.Infinity;
import static jdk.nashorn.internal.objects.Global.NaN;

public class MainApp2 {
    public static void main(String[] args) {

        userNumber();                                        //Задание 1

        double[] intArray = new double[]{5,7,9,2,0,4,7,9,10};//Задание 2
        try {
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            if (catchedRes1 != Infinity && catchedRes1 != NaN){
                System.out.println("catchedRes1 = " + catchedRes1);
            } else {
            System.out.println("Catching exception");
            }
        } catch (IndexOutOfBoundsException e){
            System.out.println("Attempt to access a non-existent index");
        }

        try {                                             //Задание 3
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = { 1, 2 };
            abc[3] = 9;
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        } catch (Throwable ex) {
            System.out.println("Что-то пошло не так...");//удалила catch NullPointerException так как не вижу
        }                                                //ситуации в которой он может возникнуть

        userString();                                    //Задание 4

    }

    /*Задание 3*/
    public static void printSum(Integer a, Integer b) {
        System.out.println(a + b);
    }


    /*Задание 1*/
    public static float userNumber(){
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Введите дробное число");
        float a = 0;
        while (true){
            try {
                a = scanner1.nextFloat();
                System.out.println("Ваше число " + a);
            } catch (InputMismatchException ex) {
                System.out.println("Указан не число, введите число");
                String line = scanner1.nextLine();
            }
        }
    }

    /*Задание 4*/
    public static String userString(){
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Введите строку");
        String str;
        while (true){
           str = scanner1.nextLine();
           if (str.isEmpty()){
               System.out.println("Пустую строку вводить нельзя, введите строку");
           } else {
           System.out.println("Ваше строка " + str);
           }
        }
    }
}
