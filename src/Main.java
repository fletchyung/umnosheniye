import java.util.Scanner;

public class Main {
    public static int multiplication(int num1, int num2) {
        int result = 0;
        num1 = Math.abs(num1);
        for (int i = 0; i < num1; i++) {
            result += num2;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int num1 = in.nextInt();
        System.out.print("Введите второе число: ");
        int num2 = in.nextInt();
        if (num1 < 0 && num2 < 0) {
            System.out.println("\nОтвет: " + multiplication((-num1), (-num2)));
        } else if (num1 < 0) {
            System.out.println("\nОтвет: " + "-" + multiplication((-num1), num2));
        } else if (num2 < 0) {
            System.out.println("\nОтвет: " + "-" + multiplication(num1, (-num2)));
        } else {
            System.out.println("\nОтвет: " + multiplication(num1, num2));
        }
    }
}