package practike14;

import java.util.Scanner;

public class Task9 {

    /**
     * Постройте частотный словарь букв русского (или английского)
     * алфавита. Здесь не имеет значения проблема выбора и анализа корпуса языка,
     * достаточно будет взять текст небольшой длины).
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку для проверки частоты: ");
        String text = scanner.nextLine();

        int[] result = new int['я' - 'а' + 1];
        for(int i = 0; i < text.length(); i++){
            char ch = text.charAt(i);
            if(ch >= 'а' && ch <= 'я'){
                result[ch - 'а']++;
            }
        }

        for(int i = 0; i < result.length; i++){
            int count = result[i];
            if(count > 0) {
                System.out.println((char) (i + 'а') + " = " + count);
            }
        }
    }
}