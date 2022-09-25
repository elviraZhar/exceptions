package UserGuide;

public class CheckAmount {
    public static int checkAmount(String[] s){
        if (s.length < 6){
            return -1;//пользователь ввел меньше данных
        } if (s.length > 6){
            return  -2;//Пользователь ввел больше данных
        }
        return s.length;
    }
}
