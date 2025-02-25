import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        // Завдання 1
        int[] oddNumbers = new int[50];
        for (int i = 0; i < 50; i++) {
            oddNumbers[i] = i * 2 + 1;
        }
        System.out.println(Arrays.toString(oddNumbers));

        // Завдання 2
        int[] randomArray = new int[20];
        for (int i = 0; i < 20; i++) {
            randomArray[i] = random.nextInt(10);
        }
        System.out.println("Оригінальний масив: " + Arrays.toString(randomArray));
        for (int i = 1; i < 20; i += 2) {
            randomArray[i] = 0;
        }
        System.out.println("Оновлений масив: " + Arrays.toString(randomArray));

        // Завдання 3
        int[][] arrays = new int[3][5];
        double[] averages = new double[3];
        for (int i = 0; i < 3; i++) {
            int sum = 0;
            for (int j = 0; j < 5; j++) {
                arrays[i][j] = random.nextInt(6);
                sum += arrays[i][j];
            }
            averages[i] = sum / 5.0;
            System.out.println(Arrays.toString(arrays[i]));
        }
        int maxAvgIndex = 0;
        for (int i = 1; i < 3; i++) {
            if (averages[i] > averages[maxAvgIndex]) {
                maxAvgIndex = i;
            }
        }
        System.out.println("Найбільше середнє арифметичне у масиву " + (maxAvgIndex + 1));

        // Завдання 4
        int[] arr1 = new int[10];
        int[] arr2 = new int[10];
        int[] sumArray = new int[10];
        for (int i = 0; i < 10; i++) {
            arr1[i] = random.nextInt(11);
            arr2[i] = random.nextInt(11);
            sumArray[i] = arr1[i] + arr2[i];
        }
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(sumArray));

        // Завдання 5
        int[] array15 = new int[15];
        int evenCount = 0;
        for (int i = 0; i < 15; i++) {
            array15[i] = random.nextInt(11);
            if (array15[i] % 2 == 0) evenCount++;
        }
        System.out.println("Масив: " + Arrays.toString(array15));
        System.out.println("Кількість парних елементів: " + evenCount);

        // Завдання 6
        int[][] matrix = new int[15][];
        for (int i = 0; i < 15; i++) {
            int cols = (i < 4) ? 5 : (i < 8) ? 8 : (i < 12) ? 3 : 9;
            matrix[i] = new int[cols];
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = random.nextInt(16);
            }
            System.out.println(Arrays.toString(matrix[i]));
        }
    }
}
