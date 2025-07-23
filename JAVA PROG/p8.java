//// Program to find the second largest number among three numbers 
import java.util.Scanner;
public class p8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.nextLine();
        int c = sc.nextInt();

        if((a <b && a >c) || (a<c && a>b)){
            System.out.println("the second largest number is a: "+ a);
        } else if( (b > a && b<c)|| (b>c && b<a)){
            System.out.println("The second largest number is b: " + b);
        } else {
            System.out.println("The second largest number is c: " + c);
        }
     
}
}
