import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Football {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sg = sc.nextLine();
        char[] arr = sg.toCharArray();
        int count = 1;
        int max=count;
        if (arr.length < 7) {
            System.out.println("NO");
        } else {
            for (int i = 0; i < arr.length-1; i++) {
                if (arr[i] == arr[i+1]) {
                    count++;
                    if(count>max){
                        max=count;
                    }
                }
                else{
                    count=1;
                }
            }
            if (max >= 7) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            sc.close();
        }

    }
}
