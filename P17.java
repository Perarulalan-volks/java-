//program to print ASCII value from A - z.
/*import java.util.Scanner;
public class P17 {
    public static void main(String[] args){
        for (char ch = 'A';ch <= 'Z';ch++){
            // int ch1 = (int)ch;
            // System.out.println(ch + " is " + ch1);
            System.out.println("the ascii value of "+ch+ " is " + (int)ch);
        }
    }
    
}*/

//program giving ASCII value as a input and get o/p as there scharacter
/*import java.util.Scanner;
public class P17 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // System.out.println("Enter a number");
    // int num = sc.nextInt();

    for(int i = 65;i<=127;i++){
    char ch = (char) i ;
    System.out.println("the character of "+ i + " is " + ch);
    }
}
}
*/

import java.util.Scanner;
public class P17 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the input");
        char ch = sc.next().charAt(0);
        int b = (char)ch;
        if(ch<='A' && ch>='Z'){
        System.out.println(b +" is a upper case character");
    }   else if(ch <= 'a' && ch >='z'){
        System.out.println(b +" is a lower case character");
    }else if(ch <='0' && ch>= '9'){
            System.out.println(b +" is a Didgit case character");
        }else{
            System.out.println(b +" is a Special case character");


        }
  

        }
    }

