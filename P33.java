import java.util.Scanner;
public class P33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int luckynum = sc.nextInt();
        

        if(luckynum >99 && luckynum<1000){
            if(((luckynum%100)/10) %3==0){
                System.out.println(luckynum + " congrats you chosed lucky number");
            }
                else
                {
                    System.out.println(luckynum + "Its not a fancy num");

                }

            }
        }
    }
    
    //find a fancy number if middle number is divisible by 3.

