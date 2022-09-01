import java.io.IOException;
import java.util.Scanner;

public class Project2 {

    static final int SIZE = 10;

    public static void main(String[] args) {
        // десять первых чисел гармонического ряда

        for(int i = 0; i < SIZE; i++) {
            double result = 1./(i+1);
            System.out.print(String.format("%.2f", result));
            if(SIZE-1 != i) {
                System.out.print(", ");
            }
        }
    }

}
