import java.util.Scanner;


public class GGTest {

public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int randomNumber = (int) (Math.random() * 100) + 1;
            int remainingAttempts = 3;

            for (int i = 0; i < 3; i++) {
                System.out.print("Tahmininizi girin (1-100 arası): ");
                int guess = scanner.nextInt();

                if (guess == randomNumber) {
                    System.out.println("Bildiniz!");
                    break;
                } else {
                    remainingAttempts--;
                    if (remainingAttempts > 0) {
                        System.out.println("Bilemediniz. Kalan hak: " + remainingAttempts);
                    } else {
                        System.out.println("Bilemediniz. Hakkınız kalmadı. Doğru cevap: " + randomNumber);
                    }
                }
            }
        }
    }

