package practike5;

public class Task3 {

    private static void showSequence(int start, int end) {
        if(start == end) {
            return;
        }
        if(start < end) {
            showSequence(start, end - 1);
            System.out.print(end + " ");
        } else {
            System.out.print(start + " ");
            showSequence(start-1, end);
        }
    }

    public static void main(String[] args) {
        int A = 10;
        int B = 5;

        if(A > B) {
            B--;
        } else {
            A--;
        }
        showSequence(A, B);
    }

}
