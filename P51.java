import java.util.Scanner;
import java.util.Vector;

public class P51 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Vector<Integer> numbers = new Vector<>();

        System.out.println("Enter the nuumber of elements");
        int n = sc.nextInt();

        System.out.println("Enter the elements: ");
        for(int i = 0;i<n;i++){
            numbers.add(sc.nextInt());
        }
        System.out.println("VEctor elements: " + numbers );
    

    //update element

    int index = sc.nextInt();

    int element = sc.nextInt();

    if(index >=0 && index<numbers.size()){{
        numbers.set(index,element);
    }
    System.out.println("VEctor elem: " +numbers);

    System.out.println("remove value of index");

    int Remove = sc.nextInt();
    numbers.remove(Remove);

    System.out.println("vector elem : " + numbers) ;


    //search
    System.out.println("Enter the search element");
    int numsearch = sc.nextInt();
    if(numbers.contains(numsearch)){
        System.out.println("founded ");
    }
    else{
        System.out.println("not found");

        
    }
    System.out.println("First element : " + numbers.firstElement());
    System.out.println("First element : " + numbers.lastElement());
    sc.close();
    System.out.println("vector element: " + numbers);
}


    }
    
}
