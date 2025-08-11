import java.util.*;

    public static int n(int marks){ //function to add number
   if(marks>=90 && marks<=100){
    return 'O';
   }
   else if(marks>=79 && marks<=80){
    return "A '\'+";    
    }
    else if(marks>=69 && marks<=70){
    return 'A';    
    }
    else if(marks>=59 && marks<=60){
    return "B'\'+";    
    }
    else if(marks>=49 && marks<=50){
    return 'B';    
    }
    else if(marks<=49){
        return "R'\'A";    
    }
    else {
        String a = "give valid num";
        return ;
    }
}
     public class P49AUMARK {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        ArrayList <Integer> portal = new ArrayList<>();
        System.out.println(" count of subject marks");
        int n = sc.nextInt();
        
        for(int i = 1;i<=n;i++){
            int marks = sc.nextInt();
            portal.add(marks);









        }
    }
    
}
