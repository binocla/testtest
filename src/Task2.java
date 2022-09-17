import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        // Task3.docx
        // Task7
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); // Сколько будет чисел
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            int a = in.nextInt();
            // 123 -> "123"
            String s = String.valueOf(a);
//            if (s.length() == 1) {
//                cnt++;
//            }
            boolean flag = false;
            // 123
            for (int j = 0; j < s.length() - 1; j++) {
                if (s.charAt(j) > s.charAt(j + 1)) {
                    flag = true;
                } else {
                    flag = false;
                }
            }
            if (flag == true) {
                cnt++;
            }
        }
        if (cnt == 3) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
