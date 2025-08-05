import java.util.Scanner;
public class P29 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int row = sc.nextInt();
    int column = sc.nextInt();

    int [][] matrix = new int [row][column];
    int sum = 0;

    for(int i=0;i<row;i++) {
        for (int j = 0; j<column; j++){
            matrix[i][j] = sc.nextInt();
            sum+=(matrix[i][j]);
            System.out.println(sum);
        }
    }
}
}

//find the sum of matrix
