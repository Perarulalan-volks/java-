import java.util.*;
public class P48 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet <String> players = new HashSet <> ();
System.out.println("count of player");
        int n = sc.nextInt();
        sc.nextLine();

        for(int i= 1;i<=n;i++){
            System.out.println("Enter player names : ");
            String names = sc.nextLine();
            players.add(names);

            

        }
        System.out.println("size of the set " +players.size());

        
    }
    
}
