import java.util.Scanner;
public class Question4 {
   
   int returnIndex(int[] arr, int key) {
      int index = -1;

      for(int i = 0; i < arr.length; ++i) {
         if (arr[i] == key) {
            index = i;
            break;
         }
      }

      return index;
   }

   public static void main(String[] var0) {
      Question4 q4 = new Question4();
      Scanner sc = new Scanner(System.in);

      int[] a = new int[]{5, 4, 3, 8, 7};
      System.out.print("Array: ");
      for(int i : a){
        System.out.print(i + " ");
      }
      System.out.println();
      System.out.print("Enter number to find: ");
      int n = sc.nextInt();
      
      int index = q4.returnIndex(a, n);
      System.out.println("Index: "+index);
   }
}
