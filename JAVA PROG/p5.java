//check divisible by 3, 5, or both.
import java.util.Scanner;
public class p5 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int Number = sc.nextInt();

        if(Number % 3 == 0 && Number % 5 == 0){
            System.out.println("Divisible by both 3 & 5");
        } else if(Number % 3 == 0) {
            System.out.println("Divisible by only 3");
        } else if(Number % 5 == 0) {
            System.out.println("Divisible by 5");
        } else {
            System.out.println("Not divisible by both");
        }


    }
    
}
