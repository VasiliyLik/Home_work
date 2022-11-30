import java.util.Arrays;
// Создайте массив типа int. Отсортируйте массив по убыванию либо по возрастанию удобным для вас спсобом.
// Результат вывести на экран.
public class Task2_5 {
    public static void main(String[] args) {
        int[] array = {2, 5, 1, 3, 8, 7, 10, 4, 9, 6};

        System.out.println("созданный массив: " + Arrays.toString(array)); //выводим массив для визуального сравнения
// пузырьковая сортировка по возрастанию
        for (int a = 1; a < array.length; a++) {
            for (int b = array.length - 1; b >= a; b--) {
                if (array[b - 1] > array[b]) {
                    int t = array[b - 1];
                    array[b - 1] = array[b];
                    array[b] = t;
                }
            }
        }
        System.out.println("отсортированный массив по возрастанию: " + Arrays.toString(array)); // выводим результат сортировки

        //сортировка в обратном порядке
        for (int i = 0; i < array.length / 2; i++) {
            int tmp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = tmp;
        }
        System.out.println("отсортированный массив по убыванию: " + Arrays.toString(array));

        Arrays.sort(array);  //автоматическая сортировка методом sort
        System.out.println("отсортированный массив методом sort: " + Arrays.toString(array));
    }
}

