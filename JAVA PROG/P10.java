import java.util.Scanner;

public class P10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();  //array size
        
        int [] arr=new int[n]; //array decleration 
        int [] freq=new int[n]; // freq array decleration
        
        int visited=-1;
        
        System.out.print("Enter the elements: ");
        for(int i=0;i<n;i++){  //getting 
            arr[i]=sc.nextInt();
        }
        
        //count frequency
        for(int i=0;i<n;i++){   
           int count=1;
           
           for(int j=i+1;j<n;j++)
           {
            if(arr[i]==arr[j])
            {
                count++;
                freq[j]=visited;//marking visited
            } 
            
            }
        if(freq[i]!=visited)
        {
            freq[i]=count;
        }
        
        }
        
        System.out.println("Element : Frequency");
        
        for(int i=0;i<n;i++){
            if(freq[i]!=visited){
                System.out.println(arr[i]+ " Count: "+freq[i]);
            }
        }
        
    }   
		
}