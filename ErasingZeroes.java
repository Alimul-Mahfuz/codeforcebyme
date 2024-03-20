import java.util.ArrayList;
import java.util.Scanner;

public class ErasingZeroes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        int t = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < t; i++) {
            String word = sc.nextLine();
            list.add(word);
        }

        for (String word : list) {
            char[] arr=word.toCharArray();
            int p=0;
            int nz=0;
            int fp=0;
            int lp=0;
            while(p<arr.length){
                if(arr[p]=='1'){
                    fp=p;
                    int j=p+1;
                    while(j<arr.length){
                        if(arr[j]=='1'){
                            lp=j;
                        }
                        j++;
                    }
                    break;
                }
                p++;
            }
            if(fp==lp){
                System.out.println(0);
            }
            else{
                for(int k=fp;k<lp;k++){
                    if(arr[k]=='0'){
                        nz++;
                    }
                }
                System.out.println(nz);
            }
        }
        sc.close();
    }
}
