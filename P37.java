import java.util.Scanner;
public class P37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int div = 0;

        for(int i=1;i<=N;i++){
            if(N%i==0)
            div++;
        }
    
        if(div==2){
            System.out.println("it is premius num");
        } else{

            System.out.println("regular num");
        }

}
}

//fine the prmium number by giving number 
//the p.number is divided by 1 and itself or also called prime number.