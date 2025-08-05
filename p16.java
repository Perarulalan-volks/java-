// ASCII VALUE FOR THE WORDs

import java.util.Scanner;
public class p16 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        //enter the word//
        String input = sc.next();
        for(int i = 0;i <input.length();i++){
            char ch = input.charAt(i);
            int ASCII = (int) ch;
            System.out.println("Acii of " + ch + " = "  +  ASCII);

        }


        


    }
}