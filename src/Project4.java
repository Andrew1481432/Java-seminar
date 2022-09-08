import java.util.Scanner;


/**
 * На вход получаем любое число(дробное) в 10-ичной системе исчисления
 * Также на вход получаем систему счисления
 * Программа должна перевести из 10 в любую систему исчисления
 */
public class Project4 {

    public static double roundAvoid(double value, int places) {
        double scale = Math.pow(10, places);
        return Math.round(value * scale) / scale;
    }

    private static String from_10_to_any(double N, int sys) {
        String[] tab = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};

        StringBuilder result = new StringBuilder();
        int intN = (int)N;
        double partDoubleN = roundAvoid(N - intN, 3);

        while(intN > 0) {
            result.insert(0, tab[intN % sys]);
            intN /= sys;
        }
        StringBuilder resultPart2 = new StringBuilder();
        int i = 0;
        while(i < 4) {
            partDoubleN *= sys;

            int partDoubleInt = (int)partDoubleN;
            int index = partDoubleInt % sys;
            resultPart2.append(tab[index]);
            partDoubleN -= (int)partDoubleN;
            if(0.0 == partDoubleN) {
                break;
            }
            i++;
        }
        return result+","+resultPart2;
    }

    public static void main(String[] args) {
        System.out.print("Любое число(₁₀) = ");
        Scanner input = new Scanner(System.in);
        double N = input.nextDouble();
        if(N < 1) {
            System.out.println("Введите положительное число!");
            return;
        }
        System.out.print("Систему исчисления = ");
        int sys = input.nextInt();
        if(sys < 2) {
            System.out.println("Введите число больше 1!");
            return;
        }

        String result = from_10_to_any(N, sys);
        System.out.println("Число "+N+"<10> = "+result+"<"+sys+">");
        System.out.println("Число "+N+"<10> = "+from_10_to_any(N, 2)+"<2>");
        System.out.print("Число "+N+"<10> = "+from_10_to_any(N, 16)+"<16>");
    }

}
