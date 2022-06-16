import java.util.Scanner;

public class SumOfFactorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int total = 0;
        int i = 1;

        while (i <= N) {
            int factorial = 1;
            int j = 1;

            while (j <= i) {
                factorial = factorial * j;
                j = j + 1;
            }
            total = total + factorial;
            i = i + 1;
        }
        System.out.println(total);
    }
}
