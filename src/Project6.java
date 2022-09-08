import java.util.Scanner;

/**
 * Написать программу
 * получаем 2 числа
 * первое задает число серии фобоначи
 * второе с какого элемента начинается
 */
public class Project6 {
//    public int fibonacci(int n)  {
//        if(n == 0)
//            return 0;
//        else if(n == 1)
//            return 1;
//        else
//            return fibonacci(n - 1) + fibonacci(n - 2);
//    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите число серии фобоначи: ");
        int num1 = input.nextInt();
        System.out.print("С какого элемента начинаем: ");
        int num2 = input.nextInt();

        int n0 = 1;
        int n1 = 1;
        int n2;

        boolean isShow = false;
        if(n0 == num1) {
            System.out.print(n0 + " " + n1 + " ");
            isShow = true;
        }
        while(num1 > 0) {
            n2=n0+n1;

            if(num2 == n2) {
                isShow = true;
            }

            if(isShow) {
                System.out.print(n2+" ");
                num1--;
            }

            n0=n1;
            n1=n2;
        }
        System.out.println();
    }

}
