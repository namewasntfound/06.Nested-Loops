import java.util.Scanner;

public class Travelling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input;
        double totalSavings = 0;
        boolean isEnough = false;


        while (!"End".equals(input = scanner.nextLine())) {
            double budget = Double.parseDouble(scanner.nextLine());
            while (totalSavings < budget) {
                double savings = Double.parseDouble(scanner.nextLine());
                totalSavings += savings;
                if (totalSavings >= budget) {
                    isEnough = true;
                    break;
                }
            }
            if (isEnough) {
                System.out.printf("Going to %s!%n", input);
                totalSavings = 0;
                isEnough = false;
            }
        }
    }
}