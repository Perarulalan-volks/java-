import java.util.*;
     public class P49 
{
    public static void main(String[] args)
     {
        Scanner sc =new Scanner(System.in);
        ArrayList <Integer> arr = new ArrayList<>();
        ArrayList <String> grades =new ArrayList<>();
        System.out.println(" count of subject marks");
        int n = sc.nextInt();
        
        for(int i = 0;i<n;i++){
            int marks = sc.nextInt();
            arr.add(marks);
        }
        Collections.sort(arr);
        for (Integer i: arr) {
            grades.add(grade(i));
            
        }
        System.out.print(arr);
        System.out.println();
        System.out.println(grades);
        
    }

     




    public static String grade (int marks)
    { 
   if(marks>=90 && marks<=100){
    return "o";
   }
   else if(marks>=79 && marks<=80){
    return "A+";    
    }
    else if(marks>=69 && marks<=70){
    return "A";    
    }
    else if(marks>=59 && marks<=60){
    return "B+";    
    }
    else if(marks>=49 && marks<=50){
    return "b";    
    }
    else
    {
        return "RA";    
    }
    
}
}
