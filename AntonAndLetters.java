import java.util.Scanner;

public class AntonAndLetters {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String sg=sc.nextLine();
        if(sg.length()==2){
            System.out.println(0);
        }
        else{
            sg=sg.substring(1, sg.length()-1);
            String[] arr=sg.split(",");
            for(int i=0;i<arr.length;i++){
                arr[i]=arr[i].trim();
            }
            int count=0;
            for(int i=0;i<arr.length;i++){
                if(arr[i]!=" "){
                    for(int j=i+1;j<arr.length;j++){
                        if(arr[i].equals(arr[j])){
                            arr[j]=" ";
                        }
                    }
                    count++;
                }
            }
            System.out.println(count);

        }
        sc.close();
    }
}
