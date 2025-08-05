import java.util.Scanner;
public class P24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Strength_stu = sc.nextInt();
        int Team_mem = sc.nextInt();
        
        int r = Strength_stu % Team_mem;
        int Each = (Strength_stu - r )/ Team_mem;

        System.out.println("The number of student in each team is "+ Each + " and left out is " + r);
        
    }
    
}

// to find the n0. of student in each team and no. of student left out.
