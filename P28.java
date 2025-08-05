// import java.util.Scanner;
// public class P28 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int row = sc.nextInt();
//         int column = sc.nextInt();
//         int threenum= sc.nextInt();
//          int [][] matrix2= new int[row][column];

//          for(int i=0;i<row;i++){
//             for(int j = 0;j<column;j++){
//                matrix2[i][j]=sc.nextInt();
//             }
//         }
//         if([i] >= [j]&& j || i<=j){
//             System.out.println("YEs");

//         }


//     }
    
// }

// import java.util.Scanner;

// public class P28 {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int row = sc.nextInt();
//         int column = sc.nextInt();
//         int treeno = sc.nextInt();
//         boolean flag = false;
//         int[][] matrix = new int[row][column];
//         int n =1;
//         for (int i = 0; i < row; i++) {
//             for (int j = 0; j < column; j++) {
//                 matrix[i][j] = n++;
//             }
//         }
//         for(int i=0; i<row;i++){
//             for (int j = 0; j < column; j++) {
//                 if((i==0 && (0<=j &&j<column))||((0<=i && i<row)&&j==0)||(j==column && (0<=i && i<column))){
//                     if(matrix[i][j]==treeno){
//                         flag = true;
//                         break;
//                     }
//                 }
//             }
//         }
//         System.out.println(flag?"Yes":"No");
//         sc.close();
//     }
// }

// import java.util.Scanner;

// public class P28
// {
// 	public static void main(String[] args) {
// 		Scanner sc=new Scanner(System.in);
		
// 		int row =sc.nextInt();
// 		int column =sc.nextInt();
// 		int tree=sc.nextInt();
// 		int [][] matrix2=new int [row][column];
		
// 		if(tree>=1 && tree<=column || tree%column==1 || tree%column==0 ){
// 		    System.out.println("Yes");
// 		}else{
// 		    System.out.println("No");
// 		}
// 	}
// }

import java.util.Scanner;

public class P28
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int row =sc.nextInt();
		int column =sc.nextInt();
		int tree=sc.nextInt();
		int [][] matrix2=new int [column][row];
		
		if( tree%row==1 && tree<=column*row || tree<=(row*column) && tree<=(column*row-1)+1 || tree>=1 && tree<=row || tree>=(column-1)*(row-1) && tree<=(column*row)-row ){
		    System.out.println("Yes");
		}else{
		    System.out.println("No");
		}
	}
}
 // finding the 1st and last col and 4th col and 1st row.

