//Write a program chack if a number is divisible by 3 and 5
import java.util.Scanner;
public class p4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number =  sc.nextInt();

        if(number % 3 == 0 && number % 5 == 0){
            System.out.println("The number is divisible by 3 and 5.");

        } else {
        System.out.println("The number is not divisible by 3 and 5.");
        
    }
    
}
}
