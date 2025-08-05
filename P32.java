import java.util.Scanner;
public class P32 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String A = sc.nextLine();
    
    A=A.toLowerCase();

    if(A.equals("rock")){
        System.out.println("Paper");
    }
    else if (A.equals("paper")){
        System.out.println("Scissor");
    } else if( A.equals("scissor")){
        System.out.println("Rock");

        }
        else
        {
            System.out.println("INVALId");
        }
    }
    

}

//rock paper scissor
