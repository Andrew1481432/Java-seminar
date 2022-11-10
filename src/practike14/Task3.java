package practike14;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3 {


    /**
     Дан текст со списками цен. Извлечь из него цены в USD, RUВ, EU.
     a) пример правильных выражений: 25.98 USD.
     b) пример неправильных выражений: 44 ERR, 0.004 EU.
     *
     * @param args
     */
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("(\\d+)(\\.(\\d+))? (USD|RUB|EU)");
        Matcher matcher = pattern.matcher("25.98 USD");
        if(matcher.matches()) {
            String cost = matcher.group(1);
            if(matcher.group(2) != null) {
                cost += matcher.group(2);
            }
            System.out.println(Float.parseFloat(cost));
        } else {
            System.out.println("Некорректный input!");
        }
    }

}
