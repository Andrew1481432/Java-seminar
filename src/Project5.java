import java.util.ArrayList;
import java.util.Scanner;

/**
 * Нужно написать программу которая сгенерирует целочисленный масссив числа [0 - 100]
 * N = Число элементов с клавиатуры
 * Дальше запрашивается число, которое надо удалить из всего массива
 * Дальше запрашивается цифра(0 - 9), И все числа массива которые оканчивается на эту цифру должны быть удалены.
 */
public class Project5 {

    private static int getRandomDiceNumber() {
        return (int) (Math.random() * 100) + 0;
    }

    private static void show(ArrayList<Integer> arr) {
        boolean isFirst = true;
        for(int num: arr) {
            if(!isFirst) {
                System.out.print(", ");
            }
            System.out.print(num);
            isFirst = false;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.print("Количество элементов массива = ");
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        if(N < 1) {
            System.out.println("Введите положительное число!");
            return;
        }

        ArrayList<Integer> arr = new ArrayList<>(N);
        for(int i = 0; i < N; i++) {
            arr.add(getRandomDiceNumber());
        }
        show(arr);
        System.out.print("Введите число которое вы хотите удалить из всего массива: ");
        int input1 = input.nextInt();
        arr.removeIf(s -> s.equals(input1));
        show(arr);
        System.out.print("Введите цифру которую вы хотите удалить из всего массива: ");
        int input2 = input.nextInt();
        if(input2 < 0 || input2 > 9) {
            System.out.println("Введите цифру!");
            return;
        }
        arr.removeIf((s) -> {
            int digit = s % 10;
            return digit == input2;
        });
        show(arr);
    }

}
