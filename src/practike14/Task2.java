package practike14;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task2 {


    /**
     2. Написать регулярное выражение, определяющее является ли данная
     строка строкой "abcdefghijklmnopqrstuv18340" или нет.

     a) пример правильных выражений: abcdefghijklmnopqrstuv18340

     b) пример неправильных выражений:
     abcdefghijklmnoasdfasdpqrstuv18340.
     *
     * @param args
     */
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("abcdefghijklmnopqrstuv18340");
        Matcher matcher = pattern.matcher("abcdefghijklmnopqrstuv18340");
        if(matcher.matches()) {
            System.out.print("ДА");
        } else {
            System.out.print("НЕТ");
        }
    }

}
