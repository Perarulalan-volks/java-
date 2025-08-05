import java.util.Scanner;
public class P34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int R1 = sc.nextInt();
        int N = sc.nextInt();
        int R2 = sc.nextInt();
        int X = sc.nextInt();

        int totalhour = (X + 59)/60;
       
    

        if(totalhour<=N){ 
            System.out.println("travel cost is : " + (N * R1));
        } else {
            System.out.println("travel cost for extra is : " + ((N * R1)+(totalhour-N) * R2));
        }

    }
    
}


// caluclate the amount of rent car by hours
