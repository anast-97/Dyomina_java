import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Введите целое число №1: ");
            int a = scanner.nextInt();

            System.out.print("Введите целое число №2: ");
            int b = scanner.nextInt();

            if (a > b) {
                System.out.println("Результат a > b.");
            } else if (a < b) {
                System.out.println("Результат a < b.");

            } else {
                System.out.println("Результат сравнения a = b.");
            }

            System.out.println("Сложение (a + b) = " + (a + b));
            System.out.println("Вычетание (a - b) = " + (a - b));
            System.out.println("Умножение (a * b) = " + (a * b));

            if (b != 0) {
                System.out.println("Деление (a / b) = " + ((double) a / b));
            } else {
                System.out.println("Деление (a / b) = Ошибка! На ноль делить нельзя.");
            }
        } catch (Exception e) {
            System.out.println("Ошибка ввода! Необходимо было ввести целое число.");
            scanner.nextLine();
        }
        scanner.close();
    }
}


