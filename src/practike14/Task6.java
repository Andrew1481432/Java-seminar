package practike14;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task6 {

    private static final Pattern EMAIL_PATTERN = Pattern.compile(
            "[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+(\\.[A-Za-z]{2,6})?$"
    );

    /**
     * Написать регулярное выражение, определяющее является ли данная
     * строчка допустимым (корректным) е-mail адресом согласно RFC под номером 2822.
     *
     * a) пример правильных выражений: user@example.com, root@localhost
     *
     * b) пример неправильных выражений: myhost@@@com.ru, @my.ru, Julia String
     *
     * @param args
     */
    public static void main(String... args) {
        System.out.println(checkEmail("andrew1481432@mail.ru"));
        System.out.println(checkEmail("user@example.com"));
        System.out.println(checkEmail("root@localhost"));

        System.out.println(checkEmail("myhost@@@com.ru"));
        System.out.println(checkEmail("@my.ru"));
        System.out.println(checkEmail("Julia String"));
    }

    private static boolean checkEmail(final String dateAsString) {
        Matcher m = EMAIL_PATTERN.matcher(dateAsString);
        return m.matches();
    }

}
