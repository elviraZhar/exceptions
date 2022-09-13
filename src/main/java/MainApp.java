import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainApp {
    public static void main(String[] args) {

        int[] arr1 = new int[]{1,2,3,4};
        int size1 = checkArraySize(arr1);
        System.out.println(size1);

        int[] arr2 = new int[]{1,2};
        int size2 = checkArraySize(arr2);
        if (size2 == -1) {
        System.err.println("Array size is less than min");//err - вывод строки красным шрифтом
        }

        int[] arr3 = new int[]{1,2,3,4};
        int[] arr4 = null;
        int[] arr5 = new int[]{1};

        int index1 = findIndexByElement(arr3, 2);
        processWithUser(index1);
        int index2 = findIndexByElement(arr4, 1);
        processWithUser(index2);
        int index3 = findIndexByElement(arr5, 2);
        processWithUser(index3);

        int[][] matrix = new int[][]{
                {1,0,1},
                {0,0,1},
                {1,1,1,}};
        int sum = sumOfMatrix(matrix);
        System.out.println(sum);

        int sum2 = sumOfMatrix2(matrix);
        switch (sum){
            case -1:
                System.out.println("Number of row is not equal to number of columns");
                break;
            case -2:
                System.out.println("Element is not 0 or 1");
                break;
            default:
                System.out.println(sum2);
                break;
        }

        /*f1();
        f2();
        f3();
        f4();
        f5();*/

        Integer[] arr6 = {1,2,3,4,5, null};
        checkArray(arr6);
        checkArrayN(arr6);

        int[] arr7 = new int[]{1,2,3,4};
        int[] arr8 = new int[]{2,3,4};
        int[] result = arraySum(arr7, arr8);
        String resultAsString = Arrays.toString(result);
        System.out.println(resultAsString);
    }

    public static int checkArraySize(int[] array){
        if (array.length < 3){
            return -1;
        }
        return array.length;
    }

    public static int findIndexByElement(int[] array, int element){
        if (array == null){
            return  -3;
        }
        if (array.length < 3){
            return -1;
        }
        for (int i = 0; i< array.length; i++){
            if (array[i] == element){
                return i;
            }
        }
            return -2;
    }

    public static void processWithUser(int index){
        if (index == -1){
            System.err.println("Array size less than minimum");
        } else if (index == -3){
            System.err.println("Array is null");
        } else if (index == -2){
            System.err.println("Element is not found");
        } else {
            System.out.println("Index of element is " + index);
        }
    }

    public static int sumOfMatrix(int[][] matrix){
        int sum = 0;
        for (int i = 0; i < matrix.length; i++){
            int rowNumber = matrix.length;
            int columnNumber = matrix[i].length;
            if (rowNumber != columnNumber){
                throw new RuntimeException("Number of row is not equal to number of columns");
            }
            for (int j = 0; j < matrix.length; j++){
                if (matrix[i][j] != 0 && matrix[i][j] != 1){
                    throw new RuntimeException("Element is not 0 or 1");
                }
                sum = sum + matrix[i][j];
            }
        }
        return sum;
    }

    public static int sumOfMatrix2(int[][] matrix){
        int sum = 0;
        for (int i = 0; i < matrix.length; i++){
            int rowNumber = matrix.length;
            int columnNumber = matrix[i].length;
            if (rowNumber != columnNumber){
                return -1;
            }
            for (int j = 0; j < matrix.length; j++){
                if (matrix[i][j] != 0 && matrix[i][j] != 1){
                    return -2;
                }
                sum = sum + matrix[i][j];
            }
        }
        return sum;
    }

    /*public static void f1(){
        int a = 10 / 0;
    }
    public static void f2(){
        int[]array = new int[10];
        array[100] = 1;
    }
    public static void f3(){
        String str = null;
        System.out.println(str.length());
    }
    public static void f4(){
        String str = "10e2";
       Integer.parseInt(str);
    }
    public static void f5(){
        Object obj = "5";
        Integer i = (Integer) obj;
    }*/

    public static void checkArray(Integer[] arr){
        for (Integer el : arr){
            if (el == null){
                throw new RuntimeException("There is null element in array");
            }
        }
    }

    public static void checkArrayN(Integer[] arr){
        List<Integer> indexOfNulls = new ArrayList<>();
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == null){
                indexOfNulls.add(i);
            }
        }
        if (!indexOfNulls.isEmpty()){
            throw new RuntimeException("Null elements have indexes: " + indexOfNulls);
        }
    }

    public static int[] arraySum(int[] arr1,int[] arr2){
        if (arr1.length != arr2.length){
            throw new RuntimeException("Array have different");
        }
        int[] result = new int[arr1.length];
        for (int i = 0; i < result.length; i++){
            result[i] = arr1[i] + arr2[i];
        }
        return result;
    }
}
