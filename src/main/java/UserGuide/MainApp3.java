package UserGuide;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.text.ParseException;
import java.util.Scanner;

import static UserGuide.CheckAmount.checkAmount;
import static UserGuide.CheckDate.checkDate;

public class MainApp3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ваши Фамилию Имя Отчество дату рождения(dd.mm.yyyy)" +
                " номер телефона(10 знаков) и пол (f/m) через пробелы");
        String str = scanner.nextLine();
        String[] dataUser = str.split(" ");

        switch (checkAmount(dataUser)){
            case -1:
                System.out.println("Вы ввели недостаточно данных");
                break;
            case -2:
                System.out.println("Вы ввели лишние данные");
                break;
        }
        try {
            checkDate(dataUser[3]);
        } catch (ParseException e) {
            System.out.println("Не верный формат даты рождения");
        }
        String phone = dataUser[4];
        String regex = "^\\d{10}$";
        if (!phone.matches(regex)){
            System.out.println("Номер телефона не соответствует формату");
        }

        if (!dataUser[5].equals("f") && !dataUser[5].equals("m")){
            System.out.println("Не верно указан пол");
        }

        String surname = dataUser[0];
        File f = new File("C:\\Java\\exceptions\\src\\main\\java\\UserGuide", surname);
        try {
            boolean created = f.createNewFile();
            if (created)
                try (FileWriter writer = new FileWriter(f)) {
                    for (int i=0; i<6; i++)
                        writer.write(dataUser[i] + " ");
                    writer.flush();
                }
            else {
                try (FileWriter fw = new FileWriter(f.getAbsoluteFile(), true);
                     BufferedWriter bw = new BufferedWriter(fw)) {
                    bw.newLine();
                    for (int i=0; i<6; i++)
                        bw.write(dataUser[i] + " ");
                }
            }
        }
        catch(Exception e) {
            e.getStackTrace();
        }
    }

}

