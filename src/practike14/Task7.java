package practike14;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task7 {

    private static final Pattern PASS_PATTERN = Pattern.compile(
            "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)[A-Za-z\\d_]{8,}$"
    );

    /**
     * Проверить, надежно ли составлен пароль. Пароль считается
     * надежным, если он состоит из 8 или более символов. Где символом может быть
     * цифр, английская буква, и знак подчеркивания.
     *
     * Пароль должен содержать хотя бы одну заглавную букву, одну маленькую букву и одну цифру.
     * a) пример правильных выражений: F032_Password, TrySpy1.
     * b) пример неправильных выражений: smart_pass, A007
     *
     * @param args
     */
    public static void main(String... args) {
        System.out.println(checkPass("F032_Password"));
        System.out.println(checkPass("TrySpy11"));
        System.out.println(checkPass("TrySpy1"));

        System.out.println(checkPass("smart_pass"));
        System.out.println(checkPass("A007"));
    }

    public static boolean checkPass(final String pass) {
        Matcher m = PASS_PATTERN.matcher(pass);
        return m.matches();
    }

}
