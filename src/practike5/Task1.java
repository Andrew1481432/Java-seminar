package practike5;

public class Task1 {

    private static void showMonoton(int n) {
        if(n < 1) {
            return;
        }
        showMonoton(n-1);
        for(int i = 0; i < n; i++) {
            System.out.print(n+", ");
        }
    }

    public static void main(String[] args) {
        showMonoton(4);
    }


}
