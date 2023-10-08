public class Question3 {
    public static int findMax(int [] arr, int size, int idx){
        if(idx == arr.length - 1){
            return arr[size-1];
        }
        int otherMax = findMax(arr, size, idx+1);
        int max = Math.max(arr[idx], otherMax);
        return max;

    }
    public static void main(String[] args) {
        int [] arr = new int[] {13, 1, -3, 22, 5};
        int size = arr.length;
        System.out.println("Max value: " + findMax(arr, size, 0));
    }
}
