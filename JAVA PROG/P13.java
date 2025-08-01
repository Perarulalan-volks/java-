import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class P13 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
        
        for(int i=start;i<end;i++){
            char c = S.charAt(i);
            System.out.print(c);
            
        }
    
       
        
    }
}
