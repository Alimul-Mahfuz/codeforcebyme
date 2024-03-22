import java.util.*;

public class ABeautifulYear {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        if(a >= 1000 && a <= 9000) {
            a++;
            while(isUnique(a)){
                a++;
            }
            System.out.println(a);
        }
        sc.close();
    }

    public static boolean isUnique(int a) {
        List<Integer> list = new ArrayList<>();
        int remainder = a % 10;
        a = a / 10;
        list.add(remainder);
        while (a != 0) {
            remainder = a % 10;
            list.add(remainder);
            a = a / 10;
        }
        Collections.reverse(list);
        boolean status = false;
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                if (i != j) {
                    if (Objects.equals(list.get(i), list.get(j))) {
                        return true;
                    }
                }
            }
        }
        return status;
    }
}