import java.util.Scanner;
public class P22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Square_Side = sc.nextInt();
        int RECT_Len = sc.nextInt();
        int RECT_bred = sc.nextInt();
        float circle_radius = sc.nextFloat();

        int SQUARE_AREA=Square_Side*Square_Side;
        int RECTANGLE_AREA=RECT_bred*RECT_Len;
        double CIRCLE_RADIUS=(Math.PI)*circle_radius*circle_radius;

        System.out.println(SQUARE_AREA);
        System.out.println(RECTANGLE_AREA);
        System.out.printf("%.2f\n",CIRCLE_RADIUS);
    }
}
// FInd the area of the rectangle and square . and radius of the circle.