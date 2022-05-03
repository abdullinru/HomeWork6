import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int []arr = generateRandomArray();
        //System.out.println(Arrays.toString(arr));
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
    }
    int[] arr = generateRandomArray();

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}