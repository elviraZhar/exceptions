package lesson3;

public class DivisionZeroException extends ArithmeticException{
   /* public DivisionZeroException(){
        super("Нельзя делить на 0");
    }
    public DivisionZeroException(Exception e){
        super("Нельзя делить на 0");
    }*/

    static String msg = "На 0 делить нельзя! Замените делитель!";
    DivisionZeroException(){
        super(msg);
    }

}

