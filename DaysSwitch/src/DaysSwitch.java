import java.util.Scanner;

public class DaysSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir rakam girin (1-7 arası): ");
        int dayNumber = scanner.nextInt();
        String day;

        switch (dayNumber) {
            case 1:
                day = "Pazartesi";
                break;
            case 2:
                day = "Salı";
                break;
            case 3:
                day = "Çarşamba";
                break;
            case 4:
                day = "Perşembe";
                break;
            case 5:
                day = "Cuma";
                break;
            case 6:
                day = "Cumartesi";
                break;
            case 7:
                day = "Pazar";
                break;
            default:
                System.out.println("Hatalı girdi. Lütfen 1-7 arasında bir rakam girin.");
                return;
        }

        System.out.println("Girdiğiniz rakama karşılık gelen gün: " + day);
    }
}
