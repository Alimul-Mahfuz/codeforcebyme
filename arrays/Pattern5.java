package arrays;

public class Pattern5 {
    public static void main(String[] args) {
        for(int i=0;i<5;i++){
            for(int j=0;j<5-i-1;j++){
                System.out.printf("%c",' ');
            }
            for(int k=0;k<=i;k++){
                System.out.printf("%c",'#');
            }
            System.out.println();
        }
    }
}
