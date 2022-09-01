import java.util.Arrays;

public class Project3 {

    static final int SIZE = 10;

    private static int getRandomDiceNumber() {
        return (int) (Math.random() * 10) + 1;
    }

    private static void show(int[] arr) {
        for(int i = 0; i < SIZE; i++) {
            System.out.print(arr[i]);
            if(SIZE-1 != i) {
                System.out.print(", ");
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = new int[SIZE];

        for(int i = 0; i < SIZE; i++) {
            int number = getRandomDiceNumber();
            arr[i] = number;
        }
        show(arr);
        Arrays.sort(arr);
        System.out.println("");
        show(arr);
    }

}
