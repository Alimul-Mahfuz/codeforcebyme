package arrays;

public class Pattern4 {
    public static void main(String[] args) {
        for(int i=0;i<=5;i++){
            for(int j=0;j<i;j++){
                System.out.printf("%c",'#');
            }
            System.out.println();
        }
    }
}