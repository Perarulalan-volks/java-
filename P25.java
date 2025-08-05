import java.util.Scanner;
public class P25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        int SALE_cost = (X*a);
        int print_cost = (X*b);
        int Storage_fee = 100;
        
        int profit = (SALE_cost - print_cost)-100;

        System.out.println("the profit obtained is Rs. " + profit );
    }
    
}

// to find the profit of newspaper sale