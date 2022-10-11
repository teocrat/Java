package lesson_3;


import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.util.HashMap;
import java.util.Scanner;

public class lesson_3_1 {
    public static void main(String[] args) throws ParseException, IOException {

        try (Scanner line = new Scanner(System.in)) {
            String data = null;
            String surnameOut = null;
            String nameOut = null;
            String patronymicOut = null;
            String birthdayOut = null;
            String phoneOut = null;
            String genderOut = null;
            while (true) {
                System.out.println("Введите фамилию, имя, отчество, дату рождения(dd.mm.yyyy), пол(m или f) и " +
                        "номер телефона (в формате 79092223322) через пробел");
                String dataInput = line.nextLine();
                if (dataInput.split(" ").length > 6) {
                    System.err.println("Данных больше, чем запрошено");
                } else if (dataInput.split(" ").length < 6) {
                    System.err.println("Данных меньше, чем запрошено");
                } else {
                    data = dataInput;
                    String surname = data.split(" ")[0];
                    String name = data.split(" ")[1];
                    String patronymic = data.split(" ")[2];
                    String birthday = data.split(" ")[3];
                    String gender = data.split(" ")[4];
                    String phone = data.split(" ")[5];
                    surnameOut = surname;
                    nameOut = name;
                    patronymicOut = patronymic;

                    try {
                        validateDate(birthday);
                        birthdayOut = birthday;
                    } catch (RuntimeException e) {
                        System.err.println(e);
                        continue;
                    }


                    try {
                        Long.parseLong(phone);
                        phoneOut = phone;
                    } catch (NumberFormatException e) {
                        System.err.println("Номер телефона должен содержать только цифры");
                        continue;
                    }

                    if (gender.equals("m") || gender.equals("f")) {
                        genderOut = gender;
                        break;
                    } else {
                        System.err.println("Неверные данные в строке пол");
                    }


                }

            }


            String content = surnameOut + " " + nameOut + " " + patronymicOut + " " +
                    " " + birthdayOut + " " + phoneOut + " " + genderOut;
            try (FileWriter writer = new FileWriter(surnameOut, true)) {
                writer.write(content);
                writer.append('\n');
                writer.flush();
            } catch (IOException ex) {
                System.err.println((ex.getMessage()));
            }
        }


    }

    private static void validateDate(String birthday) {
        checkDateFormat(birthday);
        checkYearValue(birthday);
        checkMounthValue(birthday);
        checkDayValue(birthday);
    }

    private static void checkDateFormat(String birthday) {
        if (!birthday.matches("\\d{2}.\\d{2}.\\d{4}")) {
            throw new RuntimeException("Неверный формат даты");
        }
    }

    private static void checkYearValue(String birthday) {
        int yyyy = Integer.parseInt(birthday.substring(6, 10));
        if (!(yyyy >= 1900 && yyyy <= 2100)) {
            throw new RuntimeException("Неверный формат года");
        }
    }

    private static void checkMounthValue(String birthday) {
        int mm = Integer.parseInt(birthday.substring(3, 5));
        if (!(mm >= 1 && mm <= 12)) {
            throw new RuntimeException("Неверный формат месяца");
        }
    }

    private static void checkDayValue(String birthday) {
        HashMap<Integer, Integer> months = new HashMap<>() {{
            put(1, 31);
            put(2, 29);
            put(3, 31);
            put(4, 30);
            put(5, 31);
            put(6, 30);
            put(7, 31);
            put(8, 31);
            put(9, 30);
            put(10, 31);
            put(11, 30);
            put(12, 31);
        }};
        int dd = Integer.parseInt(birthday.substring(0, 2));
        int mm = Integer.parseInt(birthday.substring(3, 5));
        int day = months.get(mm);
        if (dd > day || dd <= 0) {
            throw new RuntimeException("Неверно указан день");
        }


    }
}
