public class FindMinimum {
    public static int findMin(int[] arr) {
        int min = arr[0];  
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }
    public static void main(String[] args) {
        System.out.println(findMin(new int[]{1, 2, 3, 4, 5}));        // 1
        System.out.println(findMin(new int[]{10, 20, 30, 10, 20}));   // 10
        System.out.println(findMin(new int[]{0, -1, -2, -3}));        // -3
    }
}
