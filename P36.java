import java.util.Scanner;
public class P36 {
    public static void main(String[] args) {
        

    Scanner sc= new Scanner(System.in);
    int  birthyear = sc.nextInt();
    int currentyear = sc.nextInt();

    if (currentyear>birthyear) {
        System.out.println(currentyear-birthyear);
    }else 
    {
        System.out.println((100-birthyear) + currentyear);
    }

    
}
}

//to find age by gicing input as current year and birthyear
