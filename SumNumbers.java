import java.util.Scanner;

public class SumNumbers {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
    sumOfNumbers();
    }
    static void sumOfNumbers() {
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        int result = 0;
        for (int i = start; i <= end; i++) {
            result += i;
        }
        System.out.print(result);
    }
}
