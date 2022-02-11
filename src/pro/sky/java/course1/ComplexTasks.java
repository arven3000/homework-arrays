package pro.sky.java.course1;

import java.util.Arrays;

public class ComplexTasks {

    public static void main(String[] args) {

        /*Task 5*/
        int[][] matrix = new int[5][5];

        for (int i = 0, j = matrix.length - 1; i < matrix.length && j >= 0; i++, j--) {
            matrix[i][i] = 1;
            matrix[i][j] = 1;
        }

        for (int[] row : matrix) {
            for (int column : row) {
                System.out.print(column + " ");
            }
            System.out.println();
        }
        System.out.println();

        /*Task 6*/
        int[] arr1 = {5, 4, 3, 2, 1};
        System.out.println(Arrays.toString(arr1));
        int[] reverseArr = new int[arr1.length];
        for (int i = arr1.length - 1, j = 0; i >= 0; i--, j++) {
            reverseArr[j] = arr1[i];
        }
        System.out.println(Arrays.toString(reverseArr));
        System.out.println();

        /*Task 7*/
        int[] arr2 = {5, 8, 2, 3, 9};
        System.out.println(Arrays.toString(arr2));
        for (int i = 0; i < arr2.length / 2; i++) {
            int temp = arr2[arr2.length - 1 - i];
            arr2[arr2.length - 1 - i] = arr2[i];
            arr2[i] = temp;
        }
        System.out.println(Arrays.toString(arr2));
        System.out.println();

        /*Task 8*/
        int[] array = {-6, 2, 5, -8, 8, 10, 4, -7, 12, 1};
        System.out.println(Arrays.toString(array));
        int sumResult = -2;

        Arrays.sort(array);
        for (int j : array) {
            int key = sumResult - j;
            if (Arrays.binarySearch(array, key) > -1) {
                System.out.println(j + "  " + key);
                break;
            }
        }
        System.out.println();

        /*Task 9*/
        System.out.println(Arrays.toString(array));
        int firstIndex = 0;
        int lastIndex = array.length - 1;

        while (firstIndex < lastIndex) {
            int sum = array[firstIndex] + array[lastIndex];
            if (sum == sumResult) {
                System.out.println(array[firstIndex] + " " + array[lastIndex]);
                firstIndex++;
                lastIndex--;
            } else if (sum < sumResult) {
                firstIndex++;
            } else {
                lastIndex--;
            }
        }
    }
}
