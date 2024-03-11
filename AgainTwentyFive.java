import java.util.Scanner;

public class AgainTwentyFive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        double data = Math.pow(5, n);
        System.out.println(data);
        // int[] arr = new int[2];
        // int i = 0;
        // while (i < 2) {
        //     arr[i] = (int)data % 10;
        //     data = data / 10;
        //     i++;
        // }
        // System.out.printf("%d%d\n",arr[1],arr[0]);

    }
}
