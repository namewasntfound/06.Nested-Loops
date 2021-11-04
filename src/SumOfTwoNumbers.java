import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int startingNumber = Integer.parseInt(scanner.nextLine());
        int finalNumber = Integer.parseInt(scanner.nextLine());
        int magicalNumber = Integer.parseInt(scanner.nextLine());

        int combinations = 0;
        boolean flag = false;

        for (int j = startingNumber; j <= finalNumber; j++) {
            for (int i = startingNumber; i <= finalNumber; i++) {
                combinations++;
                if (i + j == magicalNumber) {
                    System.out.printf("Combination N:%d (%d + %d = %d)%n"
                            , combinations, j, i, magicalNumber);
                    flag = true;
                    break;
                }
            }
            if (flag) {
                break;
            }
        }
        if(!flag){
            System.out.printf("%d combinations - neither equals %d", combinations, magicalNumber);
        }
    }
}
