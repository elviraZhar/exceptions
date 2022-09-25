package UserGuide;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class CheckDate {
    public static boolean checkDate(String s) throws ParseException {
        SimpleDateFormat formatDate = new SimpleDateFormat("dd.mm.yyyy");
        try {
            formatDate.parse(s);
            return true;
        } catch (ParseException e) {
            System.out.println("Не верный формат даты");
        }
        return false;
    }
}
