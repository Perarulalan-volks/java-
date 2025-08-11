import java.util.Scanner;
public class P41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
double sqrt = Math.sqrt(a);

        
    
        int x = (int) sqrt +1;
        int n = ((int)Math.pow(x-1/2, 2));
        System.out.println(n);

        
             if(a<0){
            System.out.println(-1);
        } 
    } } 
