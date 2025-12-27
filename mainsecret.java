import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();

        int secret = rnd.nextInt(10) + 1;
        int attempts = 3;
        System.out.println("я загадал число от 1 до 10. попробуй угадать ");

        for (int i = 1; i <= attempts; i++) {
            int guess = sc.nextInt();

            if (guess == secret) {
                System.out.println("вау, ты угадал с " + i + " попытки ");
                return;
            } else {
                System.out.println("неа, мимо. осталось попыток: " + (attempts - i));
            }
        }

        System.out.println("игра окончена. число было: " + secret);
    }
}

