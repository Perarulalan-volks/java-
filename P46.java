import java.util.*;
public class P46 {
    public static void main(String[] args) {
    
    HashSet<String> names = new HashSet<>(); 
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    sc.nextLine();

    for(int i = 0;i<=n;i++){
        String name = sc.nextLine();
        names.add(name);
        System.out.println(names);
    }
    
    
}
}

//adding values in hashset


// import java.util.*;
// public class P46 {
//     public static void main(String[] args) {
    
//     HashSet<String> names = new HashSet<>(); 
//     Scanner sc = new Scanner(System.in);
//     int n = sc.nextInt();
//     sc.nextLine();

//     for(int i = 0;i<=n;i++){
//         String name = sc.nextLine();
//         if(names.add(name)){
//             System.out.println("new Added" + name);
//         }
//         else {
//             System.out.println("duplicate da venna " + name);
//         }
//         System.out.println(names);
//     }
    
    
// }
// }
