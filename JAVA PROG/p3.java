//sum of two numbers and find odd or even
public class p3 {
    public static void main(String[] args) {
        int FirstNumber = 10;
        int SecondNumber = 20;
        int sum = FirstNumber + SecondNumber;
        System.out.println("sum: " + sum);

        if(sum % 2 ==0){
            System.out.println("The sum is even.");
        }else {
            System.out.println("The sum is odd.");
        }
    }
    
}
