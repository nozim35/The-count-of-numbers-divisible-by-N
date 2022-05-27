import java.util.Scanner;

public class Main {
    public static void main(String... users) {

        Scanner scanner = new Scanner(System.in);

        int firstNum = scanner.nextInt();
        int secondNum = scanner.nextInt();
        int divideNum = scanner.nextInt();
        int result = 0;

        for (int i = firstNum; i <= secondNum; i++) {
            if (i % divideNum == 0) {
                result++;
            }
        }
        System.out.print(result);
    }
}
