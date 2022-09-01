
import java.io.IOException;
import java.util.Scanner;

public class Project1 {

    public static void main(String[] args) throws IOException {
        System.out.print("N = ");
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        if(N < 1) {
            System.out.println("Введите положительное число!");
            return;
        }
        int arr[] = new int[N];

        // for
        // while
        // dowhile

        System.out.print("Выберите способ ввода\n1) FOR\n2) WHILE\n3) DOWHILE\n-> ");
        int type = input.nextInt();

        switch (type) {
            case 1: {
                for (int i = 0; i < N; i++) {
                    System.out.print(i + 1 + ") = ");
                    int number = input.nextInt();
                    arr[i] = number;
                }
            }
            break;

            case 2: {
                int i = 0;
                while (i < N) {
                    System.out.print(i + 1 + ") = ");
                    int number = input.nextInt();
                    arr[i] = number;

                    i++;
                }
            }
            break;

            case 3: {
                int i = 0;
                do {
                    System.out.print(i+1 + ") = ");
                    int number = input.nextInt();
                    arr[i] = number;
                } while (i++ != N-1);
            }
            break;

            default:
                System.out.println("Задан некорректный тип выбора цикла!");
        }

        int result = 0;
        for (int num: arr) {
            result += num;
        }

        System.out.println("Сумма значений элементов массива: " + result);
    }

}
