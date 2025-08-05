import java.util.Scanner;
public class P23 {
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int ground_len = sc.nextInt();
    int ground_bred= sc.nextInt();

    int ROPE_LEN = (2*(ground_len+ground_bred));
    int CARPET_Q = (ground_len*ground_bred);

    System.out.println("Rope length is " + ROPE_LEN +" m ");
    System.out.println("The carpter required is " + CARPET_Q +"Sqm");
    
}
}

//to find the rope and quantity of carpet for  the rectangle ground.