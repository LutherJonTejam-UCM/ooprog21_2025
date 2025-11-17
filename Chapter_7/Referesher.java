public class Refresher {
    public static int countGreaterThanPrevAvg(int[] arr) {
        int count = 0;
        double sum = arr[0];

        for (int i = 1; i < arr.length; i++) {
            double avg = sum / i;
            if (arr[i] > avg) count++;
            sum += arr[i];
        }
        return count;
    }

    public static void main(String[] args) {
        int[] responseTimes = {100, 200, 150, 300};
        System.out.println(countGreaterThanPrevAvg(responseTimes));
    }
}
