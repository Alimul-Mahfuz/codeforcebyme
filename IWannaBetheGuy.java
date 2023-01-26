import java.util.ArrayList;
import java.util.Scanner;

public class IWannaBetheGuy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int[] arr = new int[x];
        for (int i = 0; i < x; i++) {
            arr[i] = sc.nextInt();
        }
        int y = sc.nextInt();
        int[] brr = new int[y];
        for (int i = 0; i < y; i++) {
            brr[i] = sc.nextInt();
        }
        int[] crr = new int[arr.length + brr.length];
        for (int i = 0; i < arr.length; i++) {
            crr[i] = arr[i];
        }
        for (int j = 0; j < brr.length; j++) {
            crr[j + arr.length] = brr[j];
        }
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < crr.length; i++) {
            if (crr[i] > 0) {
                for (int j = i + 1; j < crr.length; j++) {
                    if (crr[i] == crr[j]) {
                        crr[j] = 0;
                    }
                }
                list.add(crr[i]);
            }
        }
        if (n == list.size()) {
            System.out.println("I become the guy.");
        } else {
            System.out.println("Oh, my keyboard!");
        }
        sc.close();
    }
}
