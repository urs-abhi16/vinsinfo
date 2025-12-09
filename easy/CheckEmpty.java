public class CheckEmpty {
    public static boolean isEmpty(int[] arr) {
        return arr.length == 0;
    }
    public static void main(String[] args) {
        System.out.println(isEmpty(new int[]{}));          // True
        System.out.println(isEmpty(new int[]{1, 2, 3}));   // False
    }
}
