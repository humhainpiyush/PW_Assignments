import java.util.Scanner;

public class Question2 {
    public static int alternateSum(int num){
        if(num <= 1)
            return num;
        if(num%2 == 0){
            return alternateSum(num-1) - num;
        }
        else
            return alternateSum(num-1) + num;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int result = alternateSum(num);
        System.out.println("Result: " + result);
        sc.close();
    }
}
