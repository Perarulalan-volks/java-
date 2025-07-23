import java.util.Scanner;
public class p9 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int a = 0;
        int b = 1;
        for(int i = 0; i <= N; i++)
        {
            System.out.println(a + " ");
            int c =  a + b;
            a = b;
            b = c;
        }
    }
} 