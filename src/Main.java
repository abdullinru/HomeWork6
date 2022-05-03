import java.sql.SQLOutput;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int []arr = generateRandomArray();
        //System.out.println(Arrays.toString(arr));
        int sum=0;
        int min = 2_000_000_000;
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
            if (arr[i]>max){
                max = arr[i];
            }
            if (arr[i]< min){
                min = arr[i];
            }
        }
        double srSum = sum/(30*1.0);
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
        System.out.println("Минимальная сумма трат за день составила " + min + " рублей");
        System.out.println("Максимальная сумма трат за день составила " + max + " рублей");
        System.out.println("Средняя сумма трат за день составила " + srSum + " рублей");


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