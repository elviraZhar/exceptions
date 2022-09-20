package lesson3;

import javax.naming.OperationNotSupportedException;

public class App {
    public static void main(String[] args) {

        try (Counter counter = new Counter()) {

            for (int i = 0; i < 100; i++){
                counter.add();
            }
        } catch (OperationNotSupportedException ex) {
            System.out.println("Counter must be less then zero");
        }

        try {
            doSomething();
        } catch (RuntimeException e){
            System.out.println("Исключение");
        }
    }

    public static void doSomething() throws RuntimeException{
        System.out.println("Blabla");
        try{
          throw  new RuntimeException();
        } catch (Exception e) {
            System.out.println("Бросаем исключение");
        }
    }


}
