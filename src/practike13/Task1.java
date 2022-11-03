package practike13;

public class Task1 {

    /**
     * Напишите метод, который принимает в качестве параметра любую
     * строку, например “I like Java!!!”.
     *
     * @param str
     */
    private static void subTask1(String str) {
        System.out.println(str);
    }

    /**
     * Распечатать последний символ строки. Используем метод
     * String.charAt().
     *
     * @param str
     */
    private static void subTask2(String str) {
        System.out.println(str.charAt(str.length()-1));
    }

    /**
     * Проверить, заканчивается ли ваша строка подстрокой “!!!”.
     * Используем метод String.endsWith()
     *
     * @param str
     */
    private static void subTask3(String str) {
        System.out.println(str.endsWith("!!!"));
    }

    /**
     * Проверить, начинается ли ваша строка подстрокой “I like”.
     * Используем метод String.startsWith()
     *
     * @param str
     */
    private static void subTask4(String str) {
        System.out.println(str.startsWith("I like"));
    }

    /**
     * Проверить, содержит ли ваша строка подстроку “Java”. Используем
     * метод String.contains()
     *
     * @param str
     */
    private static void subTask5(String str) {
        System.out.println(str.contains("Java"));
    }

    /**
     * Найти позицию подстроки “Java” в строке “I like Java!!!”
     *
     * @param str
     */
    private static void subTask6(String str) {
        System.out.println(str.indexOf("Java"));
    }

    /**
     * Заменить все символы “а” на “о”.
     *
     * @param str
     */
    private static void subTask7(String str) {
        System.out.println(str.replace("a", "o"));
    }

    /**
     * Преобразуйте строку к верхнему регистру.
     *
     * @param str
     */
    private static void subTask8(String str) {
        System.out.println(str.toUpperCase());
    }

    /**
     * Преобразуйте строку к нижнему регистру.
     *
     * @param str
     */
    private static void subTask9(String str) {
        System.out.println(str.toLowerCase());
    }

    /**
     * Вырезать строку Java c помощью метода String.substring().
     *
     * @param str
     */
    private static void subTask10(String str) {
        System.out.println(str.substring(2, 6));
    }


    public static void main(String[] args) {
        subTask1("I like Java!!!");
        subTask2("Hello World)");
        subTask3("I like Java!!!");
        subTask4("I like Java!!!");
        subTask5("I like Java!!!");
        subTask6("I like Java!!!");
        subTask7("I like Java!!!");
        subTask8("I like Java!!!");
        subTask9("I like Java!!!");
        subTask10("I like Java!!!");
    }

}
