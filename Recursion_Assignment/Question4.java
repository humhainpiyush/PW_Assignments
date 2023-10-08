public class Question4 {
    public static int sumArray(int [] arr, int size, int idx){
        if(idx == size - 1)
            return arr[idx];
        else
            return arr[idx] + sumArray(arr, size, idx+1);
    }
    public static void main(String[] args) {
        int [] arr = new int[] {92, 23, 15, -20, 10};
        int size = arr.length;
        System.out.println("Sum of the elements of the array is: " + sumArray(arr, size, 0));
    }
}
