public class CheckElement {
    public static boolean containsElement(int[] arr, int target) {
        for (int num : arr) {
            if (num == target) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(containsElement(new int[]{1, 2, 3, 4}, 3));  // True
        System.out.println(containsElement(new int[]{1, 2, 3, 4}, 5));  // False
        System.out.println(containsElement(new int[]{5, 10, 15}, 10));  // True
    }
}
