import java.util.HashSet;
import java.util.Scanner;
public class P47
{
	public static void main(String[] args) {
		HashSet<String> names=new HashSet<>();
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();//4 vvv 
		sc.nextLine();
		
		System.out.println("Enter Your names");
		for(int i=0;i<n;i++){
		    String name=sc.nextLine();
		    if(names.add(name)){
		        System.out.println("Added : "+name);
		    }
		    else{
		        System.out.println("Duplicate ignored : "+name);
		    }
		}
		
		names.add("raju");
		System.out.println("Hash Set Values");
		for(String p:names){
		    System.out.println(p);
		}
// 		System.out.println(names);

			names.remove("sat");
			
			System.out.println("After remove sat : " + names);

			System.out.println("size of the set " +names.size());

			System.out.println("Is empty ? " + names.isEmpty());

			
		
		
	}
}
