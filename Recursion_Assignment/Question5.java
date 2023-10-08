import java.util.Scanner;

public class Question5 {
    public static boolean checkArmstrong(int num){
        boolean result = false;
        int demoNum = num, sum = 0;
        while(demoNum > 0){
            int lastDigit = demoNum % 10;
            sum = sum + power(lastDigit, 3);
            demoNum /= 10;
        }
        if(sum == num)
            result = true;

        return result;
    }

    public static int power(int baseValue, int exponent){
        int mid = 0, result = 0, finalResult = 0;
        if(exponent == 1){
            return baseValue;
        }
        else{
            mid = exponent/2;
            result = power(baseValue, mid);
            finalResult = result * result;
            if(exponent % 2 == 0){
                return finalResult;
            }
            else
                return baseValue * finalResult;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        boolean result = checkArmstrong(num);
        if(result == true){
            System.out.println("An Armstrong number.");
        }
        else
            System.out.println("Not an Armstrong number.");
        sc.close();
    }
}
