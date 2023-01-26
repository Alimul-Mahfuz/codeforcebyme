import java.util.ArrayList;
import java.util.Scanner;

public class SerejaAndDima {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int s=0,d=0;
        int n=sc.nextInt();
        ArrayList<Integer>list=new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(sc.nextInt());
        }
        int i=0;
        do {
            if(list.size()>1){
                if(list.get(0)>list.get(list.size()-1)){
                    if(i%2==0){
                        s=s+list.get(0);
                        list.remove(0);
                        
                    }
                    else{
                        d=d+list.get(0);
                        list.remove(0);
                        
                    }
                }
                else if(list.get(0)<list.get(list.size()-1)){
                    if(i%2==0){
                        s=s+list.get(list.size()-1);
                        list.remove(list.size()-1);
                        
                    }
                    else{
                        d=d+list.get(list.size()-1);
                        list.remove(list.size()-1);
                        
                    }
                }
            }
            else{
                if(i%2==0){
                    s=s+list.get(0);
                    list.remove(0);
                }
                else{
                    d=d+list.get(0);
                    list.remove(0);
                }
            }
            i++;
        }while(list.size()>0);
        System.out.println(s+" "+d);
        sc.close();
    }
}
