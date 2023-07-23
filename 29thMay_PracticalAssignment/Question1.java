public class Question1 {
   static int sum(int var0, int var1) {
      return var0 + var1;
   }

   static int sum(int var0, int var1, int var2) {
      return var0 + var1 + var2;
   }

   static int sum(int var0, int var1, int var2, int var3) {
      return var0 + var1 + var2 + var3;
   }

   public static void main(String[] args) {
      System.out.println(sum(1, 2));
      System.out.println(sum(1, 4, 6));
      System.out.println(sum(4, 5, 6, 8));
   }
}
