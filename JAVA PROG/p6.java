// find largest number among 3 numbers
import java.util.Scanner;
public class p6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();

        if(n1 >= n2 && n1 >= n3){
            System.out.println("The largest number is n1: " + n1);
        } else if ( n2 >=n1 && n2 >= n3){
            System.out.println("the larhest number is n2: " + n2);
        }else {
            System.out.println("THe largest number is n3: " + n3);
        }
    }
    
}
