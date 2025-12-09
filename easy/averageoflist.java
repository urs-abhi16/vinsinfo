public class AverageOfList {
    public static double findAverage(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return (double) sum / arr.length; 
    }
    public static void main(String[] args) {
        System.out.println(findAverage(new int[]{1, 2, 3, 4, 5}));  // 3.0
        System.out.println(findAverage(new int[]{10, 20, 30}));     // 20.0
        System.out.println(findAverage(new int[]{5, 5, 5}));        // 5.0
    }
}
