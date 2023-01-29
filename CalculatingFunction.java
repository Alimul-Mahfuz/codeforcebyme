import java.util.Scanner;

public class CalculatingFunction {
    public static int Calc(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                sum = sum + i;
            } else if (i % 2 != 0) {
                sum = sum - i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(CalculatingFunction.Calc(n));
        sc.close();

    }
}
