package practike5;

public class Task2 {

    private static void showSequence(int n) {
        if(n < 1) {
            return;
        }
        showSequence(n-1);
        System.out.print(n+" ");
    }

    public static void main(String[] args) {
        showSequence(10);
    }

}
