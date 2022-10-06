package practike8_11;

import java.util.Calendar;
import java.util.Scanner;

public class Task2 {


    /**
     * Приложение, сравнивающее текущую дату и дату, введенную
     * пользователем c текущим системным временем
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
        Calendar inputCal = Calendar.getInstance();
        inputCal.set(Calendar.YEAR,inputYear);
        inputCal.set(Calendar.MONTH,inputMonth-1);
        inputCal.set(Calendar.DAY_OF_MONTH,inputDay);
        inputCal.set(Calendar.HOUR_OF_DAY, 0);
        inputCal.set(Calendar.MINUTE, 0);
        inputCal.set(Calendar.SECOND, 0);
        inputCal.set(Calendar.MILLISECOND, 0);

        Calendar calCur = Calendar.getInstance();
        calCur.set(Calendar.HOUR_OF_DAY, 0);
        calCur.set(Calendar.MINUTE, 0);
        calCur.set(Calendar.SECOND, 0);
        calCur.set(Calendar.MILLISECOND, 0);
        if(inputCal.equals(calCur)) {
            System.out.print("Даты сходятся");
        } else {
            System.out.print("Даты разные");
        }
    }

}
