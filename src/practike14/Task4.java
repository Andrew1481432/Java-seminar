package practike14;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task4 {


    /**
     Дан текст, необходимо проверить есть ли в тексте цифры, за
     которыми не стоит знак «+».
     a) пример правильных выражений:(1 + 8) – 9 / 4
     b) пример неправильных выражений: 6 / 5 – 2 * 9
     *
     * @param args
     */
    public static void main(String[] args) {
        ArrayList<String> matches = new ArrayList<>();

        Pattern pattern = Pattern.compile("\\d+ \\+");
        Matcher m = pattern.matcher("(1 + 8) – 9 / 4");
        if (m.find()) {
            matches.add(m.group());
        }
        System.out.println(matches);
    }

}
