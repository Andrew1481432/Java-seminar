package practike8_11;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Task4 {

    /**
     *Напишите пользовательский код, который формирует объекты Date и
     *Calendar по следующим данным,
     *вводимым пользователем:
     *
     * <Год><Месяц><Число>
     *<Часы1><минуты>
     *
     * @param args
     */
    public static void main(String[] args) {
        System.out.print("Введите день: ");
        Scanner input = new Scanner(System.in);
        int inputDay = input.nextInt();
        System.out.print("Введите месяц(число): ");
        int inputMonth = input.nextInt();
        System.out.print("Введите месяц(год): ");
        assert inputMonth < 1 || inputMonth > 12;
        int inputYear = input.nextInt();

        System.out.print("Введите часы: ");
        int inputHour = input.nextInt();
        System.out.print("Введите минуты: ");
        int inputMinute = input.nextInt();

        Calendar inputCal = Calendar.getInstance();
        inputCal.set(Calendar.YEAR,inputYear);
        inputCal.set(Calendar.MONTH,inputMonth-1);
        inputCal.set(Calendar.DAY_OF_MONTH,inputDay);
        inputCal.set(Calendar.HOUR_OF_DAY, inputHour);
        inputCal.set(Calendar.MINUTE, inputMinute);
        inputCal.set(Calendar.SECOND, 0);
        inputCal.set(Calendar.MILLISECOND, 0);

        SimpleDateFormat sdf = new SimpleDateFormat("dd MMMM yyyy h:m");
        System.out.println("Вывод через Calendar: "+sdf.format(inputCal.getTime()));


        Date date = new Date();
        date.setTime(inputCal.getTime().getTime());
        System.out.println("Вывод через Date: "+sdf.format(date));
    }

}
