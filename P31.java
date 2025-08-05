import java.util.Scanner;
public class P31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cur_temp = sc.nextInt();

        if (cur_temp <= 0){
            System.out.println("Too cold for outdoor activities");
        }else {
            System.out.println("Safe for outdoor Activities");
        }
    }
    
}
//Climate acitivity