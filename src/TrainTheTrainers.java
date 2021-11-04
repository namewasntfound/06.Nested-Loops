import java.util.Scanner;

public class TrainTheTrainers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int jury = Integer.parseInt(scanner.nextLine());
        String input;

        double totalGrade = 0;
        double averageGrade = 0;
        int assessments = 0;

        while (!"Finish".equals(input = scanner.nextLine())) {
            for (int i = 1; i <= jury; i++) {
                double grade = Double.parseDouble(scanner.nextLine());
                totalGrade += grade;
            }
            System.out.printf("%s - %.2f.%n", input, totalGrade / jury);
            assessments++;
            averageGrade += totalGrade/jury;
            if (totalGrade > 0) {
                totalGrade = 0;
                continue;
            }
        }
        System.out.printf("Student's final assessment is %.2f.", averageGrade / assessments);
    }
}
