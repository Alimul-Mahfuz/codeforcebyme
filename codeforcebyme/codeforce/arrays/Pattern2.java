package arrays;

public class Pattern2 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for(int j=0;j<i;j++){
                System.out.printf("%c",' ');
            }
            for (int k = i; k < 5; k++) {
                System.out.printf("%c", '#');
            }
            System.out.println();
        }
    }
}
