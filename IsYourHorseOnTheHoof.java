import java.util.Arrays;
import java.util.Scanner;

public class IsYourHorseOnTheHoof {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[4];
        int count=0;
        for (int i = 0; i < 4; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < 4; i++) {
            if (arr[i] > 0) {
                for (int k = i + 1; k < 4; k++) {
                    if (arr[i] == arr[k]) {
                        arr[k] = 0;
                    }
                }
                count++;
            }

        }
        System.out.println(Math.abs(4-count));
        sc.close();
 
    }
}
