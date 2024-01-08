import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] originalArray = generateRandomArray(100, -300, 555);
        System.out.println("Исходный массив:");
        System.out.println(Arrays.toString(originalArray));

        int[] resultArray = new int[100];
        int index = 0;

        // Копирование элементов больше 0
        for (int i = 0; i < originalArray.length; i++) {
            if (originalArray[i] > 0) {
                resultArray[index] = originalArray[i];
                index++;
            }
        }

        // копирование элементов равных 0
        for (int i = 0; i < originalArray.length; i++) {
            if (originalArray[i] == 0) {
                resultArray[index] = originalArray[i];
                index++;
            }
        }

        // копирование элементов меньше 0
        for (int i = 0; i < originalArray.length; i++) {
            if (originalArray[i] < 0) {
                resultArray[index] = originalArray[i];
                index++;
            }
        }

        System.out.println("Результирующий массив:");
        System.out.println(Arrays.toString(resultArray));
    }

    // ненерация случайного массива
    private static int[] generateRandomArray(int size, int min, int max) {
        Random random = new Random();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt((max - min) + 1) + min;
        }
        return array;
    }
}