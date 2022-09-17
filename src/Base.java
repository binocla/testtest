import java.util.Scanner;

public class Base {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        // [0; a) n
        // [0; a] n + 1
        for (int i = 0; i < a; i++) {
            System.out.println(i);
        }


//        do {
//            System.out.println("Yay");
//        } while (a > 0);
//        while (a > 0) {
//            System.out.println(a);
//            a -= 13; // a--;
//            // a++
//            // a += 1;
//            // a = a + 1;
//            // a *= 10 == a = a * 10...
//            // a /= 10 == a = a / 10...
//            // ++a; a++; --a; a--;
//            // a = 0
//            // ar[++a] -> a[1]
//            // ar[a++] -> a[0], a = 1;
//        }


        // &, && : & - если слева false, то правая часть вычисляется
        // && - если слева false, то правая часть не вычисляется
        // Same for |, ||
        if (a > 0) {
            if (b > 0) {
                System.out.println("Hello");
            } else if (b == 0) {
                System.out.println("World");
            } else {
                System.out.println("!");
            }
        }
        // Тернарный оператор
        // <условие> ? <выражение1> : <выражение2>
//        a > 0 && b > 0 ? System.out.println("Hello") : System.out.println("World");

        // Циклы
        // while (условие) {}
        // for (инициализация; условие; шаг) {}

        // Логические операторы
        // <, >, >=, <=, ==, !=
        // &&, || - логическое И, логическое ИЛИ
        // ! - логическое НЕ
        // ^ - логическое исключающее ИЛИ
        // & - битовое И
        // | - битовое ИЛИ
        // >> - сдвиг вправо

        // Математические операторы
        // / -> деление без остатка
        // % -> остаток от деления
        // * -> умножение
        // + -> сложение
        // - -> вычитание

    }
}
