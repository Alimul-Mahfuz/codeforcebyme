import java.util.Arrays;
import java.util.Scanner;

public class Pangram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String sg = sc.nextLine();
        sg = sg.toUpperCase();
        char[] arr = sg.toCharArray();
        Arrays.sort(arr);
        int dup = 0;
        System.out.println();
        if (n < 26) {
            System.out.println("NO");
        } else {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] != ' ') {
                    for (int j = i + 1; j < arr.length; j++) {
                        if (arr[i] == arr[j]) {
                            arr[j] = ' ';
                            dup++;
                        }
                    }
                }
            }
            if (Math.abs(arr.length - dup) == 26) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        sc.close();

    }
}
