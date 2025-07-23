import java.util.Scanner;
import java.util.*;
public class Pattern 
{
    public static void main(String[] args) 
    {
    int a = new Scanner(System.in).nextInt();
   /*  for(int i=1;i<=2;i++)
    {
        for(int j=1;j<=i;j++)
        {
            System.out.print("* ");
        }
        System.out.println();
    }
}
}
---------------------* ** ***-----------------------------------------
         for(int i=1;i<=a;i++)
    {
        for(int j=1;j<=i;j++)
        {
            System.out.print(j+" ");
        }
        System.out.println();
    }
}
}
---------------------1 12 123---------------------------------------------
       for(int i=1;i<=a;i++)
        {
            for(int j = 1;j<=a;j++)
            {
                if(j<=i)
                    System.out.print("* ");
                else 
                
                System.out.print(" ");
                
            }System.out.println();
            
            }
        }
    }
----------------------------*  **  *** ****----------------------------------

            for(int i=1;i<=a;i++)
        {
            for(int j = 1;j<=a;j++)
            {
                if(i==j||i + j == a + 1){
                    System.out.print("* ");
                } else 
                {
                    System.out.print(" ");
                }
            } System.out.println();
        }
    }
}
-----------------------------print shape "X" with * -------------------------*/
int num =1;
            
            for(int i=1;i<=a;i++)
        {
            for(int j = 1;j<=a;j++)
            {
                if(i + j > a ){
                    System.out.print(num +" ");
                    num++;
                } else 
                {
                    System.out.print(" ");
                }
            } System.out.println();
        }
    }
}



