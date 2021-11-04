import java.util.Scanner;

public class SumPrimeNonPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input;
        int sumPrime = 0;
        int sumNonPrime = 0;
        int temp;
        int counterPrime = 0;


        while (!"stop".equals(input = scanner.nextLine())) {
            int num = Integer.parseInt(input);
            if (num < 0) {
                System.out.println("Number is negative.");
                continue;
            }
            for (int i = 1; i <= num; i++) {
                temp = num % i;
                if (temp == 0) {
                    counterPrime++;
                }
            }
            if (counterPrime == 2) {
                sumPrime += num;
                counterPrime = 0;
            } else if (counterPrime > 2) {
                sumNonPrime += num;
                counterPrime = 0;
            }
        }
        System.out.printf("Sum of all prime numbers is: %d%n", sumPrime);
        System.out.printf("Sum of all non prime numbers is: %d", sumNonPrime);

    }
}
