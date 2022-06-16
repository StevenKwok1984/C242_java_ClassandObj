import java.util.Scanner;

class PerfectSquare {
    public static boolean checkPerfectSquare(double x) {

        double sq = Math.sqrt(x);

        return ((sq - Math.floor(sq)) == 0);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num = scanner.nextDouble();
        scanner.close();

        if(checkPerfectSquare(num)) {
            System.out.println(num + " is a perfect square number");
        } else {
            System.out.println(num + " is not a perfect square number");
        }
    }
}
