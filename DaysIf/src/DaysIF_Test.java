import java.util.Scanner;

public class DaysIF_Test {


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Bir rakam girin (1-7 arası): ");
            int dayNumber = scanner.nextInt();

            if (dayNumber >= 1 && dayNumber <= 7) {
                String day;

                if (dayNumber == 1) {
                    day = "Pazartesi";
                } else if (dayNumber == 2) {
                    day = "Salı";
                } else if (dayNumber == 3) {
                    day = "Çarşamba";
                } else if (dayNumber == 4) {
                    day = "Perşembe";
                } else if (dayNumber == 5) {
                    day = "Cuma";
                } else if (dayNumber == 6) {
                    day = "Cumartesi";
                } else {
                    day = "Pazar";
                }

                System.out.println("Girdiğiniz rakama karşılık gelen gün: " + day);
            } else {
                System.out.println("Hatalı girdiniz. Lütfen 1-7 arasında bir rakam girin.");
            }
        }
    }


