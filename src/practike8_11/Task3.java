package practike8_11;

public class Task3 {

    /**
     * Доработайте класс Student предусмотрите поле для хранения даты
     * рождения, перепишите метод toString() таким образом, чтобы он разработайте
     * метод, возвращал строковое представление даты рождения по вводимому в
     * метод формату даты (например, короткий, средний и полный формат даты).
     *
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(new Student((int) (Math.random() * 300), 17, 1, 2001));
    }

}
