package pro.sky.java.course1;

import java.util.Random;

public class Part2 {
    public static void main(String[] args) {
        int[] arr = generateRandomArray();

        /*Task 1*/
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        System.out.printf("Сумма трат за месяц составила %d рублей\n", sum);

        /*Task 2*/
        int max = arr[0];
        int min = max;
        for (int j : arr) {
            if (min > j) {
                min = j;
            }
            if (max < j) {
                max = j;
            }
        }
        System.out.printf("Минимальная сумма трат за день составила %d рублей. Максимальная сумма трат за день составила %d рублей\n", min, max);

        /*Task 3*/
        sum = 0;
        for (int k : arr) {
            sum += k;
        }
        double averageSum = (double) sum / arr.length;
        System.out.printf("Средняя сумма трат за месяц составила %.2f рублей\n", averageSum);

        /*Task 4*/
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }

    public static int[] generateRandomArray() {
        Random random = new Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}
