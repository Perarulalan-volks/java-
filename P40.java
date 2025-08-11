import java.util.Scanner;
public class P40 {
    public static int a (int arr[],int b){
     int c = 0;
        for(int i=1;i<b-1;i++){
            c = c + arr[i];
            

             }
            return c;     }
    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);
    int a  = sc.nextInt();
     

    int arr[] = new int[a];

    for (int i = 0;i<a;i++){
        arr[i] = sc.nextInt();
        
    }
   
        System.out.println(arr[i]);
        
    
}
}



