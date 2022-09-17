import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // String q = "asdasdasdXZCZxc";
        // Blabla b = new Blabla(12123);
        String s = in.nextLine();
        // Методы у строк
        // 1. length() -> длина строки
        // 2. charAt(int index) -> получить символ по индексу
        // 3. equals(String s) -> сравнить строки
        // 4. toUpperCase() -> перевести в верхний регистр
        // 5. toLowerCase() -> перевести в нижний регистр
        System.out.println(s.equals("qwe"));
        System.out.println(s.length());
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());
        System.out.println(s.charAt(0));


//        int a = in.nextInt();
//        int b = in.nextInt();
//        System.out.println(q);
//        System.out.println(a + b);
    }
}
