package practike14;

import java.util.regex.Pattern;

public class Task1 {


    /**
     * Необходимо реализовать консольное приложение, позволяющее манипулировать строкой
     *
     * разбив ее на элементы путем использования
     * регулярных выражений
     *
     * @param args
     */
    public static void main(String[] args) {
        Pattern p3 = Pattern.compile("\\d+\\s?");
        String[] words = p3.split("java5tiger 77 java6mustang");
        for (String word : words)
            System.out.println(word);
    }

}
