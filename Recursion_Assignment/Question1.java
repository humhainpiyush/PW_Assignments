import java.util.Scanner;

public class Question1{

    public static int sumOfDigits(int n){
        if(n == 0){
            return 0;
        }
        else
            return (n%10) + sumOfDigits(n/10);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int result = sumOfDigits(num);
        System.out.println("Sum of the digits of " + num + " is: " + result);
        sc.close();
    }
}