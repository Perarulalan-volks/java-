
import java.util.*;
public class P44 {
    public void method(int size,Scanner sc ,List <Integer> a ){
        System.out.println("Enter the Elements upto:"+size);
         for(int i=0;i<size;i++){
            int b = sc.nextInt();
            a.add(b);
        }
        int max =0;
        for(int i:a){
            if(max<i){
                max = i;
            }
        }
        System.out.println(max);


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List <Integer> a = new ArrayList<>();
        System.out.println("Enter the size");
        int size = sc.nextInt();
        sc.nextLine();
        P44 d = new P44();
        d.method(size,sc,a);
        
    }
}