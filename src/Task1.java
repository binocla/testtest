import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        // Task3.docx
        // Task2, k, m -> между ними % 3 == 0
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        int m = in.nextInt();
        // [k; m]
        for (int i = k; i <= m; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }
}
