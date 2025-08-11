import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P43 {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List <String> list = new ArrayList<>();
      

        int n = sc.nextInt();
        sc.nextLine();
        

        System.out.println("Enter the array elements : ");

        for(int i = 0; i< n;i++){
            String b = sc.nextLine();
            list.add(b);

        }
         for(String i :list){
            System.out.println(i);
         }
    }
    
}

