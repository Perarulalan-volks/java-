//find largest three numbers if all alre same too 
import java.util.Scanner;
public class p7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a==b && b == c){
            System.out.println("all three number are equal: " + a);
        } else if (a>=b && a>=c){
            System.out.println("the largest number is a : " + a);
        } else if (b>=a && b >= c) {
            System.out.println("the largest number is b: " + b);
        } else{
            System.out.println("the larges number is c: " + c);
        }
    }
    
}
