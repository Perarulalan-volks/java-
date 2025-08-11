import java.util.Scanner;
public class P39 {

    //functionn declarartion
    public static int add(int n, int m){ //function to add number
        //int sum=m+n;
        return n+m;
    }
     public static int sub(int n, int m){ //function to add number
        //int sum2 = m-n;
        return n-m;
    }
     public static int mul(int n, int m){ //function to add number
        //int sum3 = m*n;
        return n*m ;
    }
     public static int square(int n, int m){ //function to add number
        //int sum4 =((int)Math.pow(n,m));
        //int sum4 =(n*n)+(m*m);
        //return (m*m) * (n*n); this is wrong
        return ((int)Math.pow(n,m));
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int m = sc.nextInt();

        int result = add(n,m);
        int result2=sub(n,m);
        int result3=mul(n,m);
        int result4=square(n,m);

         System.out.println("add : " +result);
          System.out.println("subraction : " +result2);
           System.out.println("multiply : " +result3);
            System.out.println("Square : " +result4);
    



        
    }
    
}
