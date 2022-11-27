// Напишите программу, которая печатает массив, затем инвертирует
// (то есть меняет местами первый элемент с последним, второй — с предпоследним и т.д.), и вновь печатает.

public class Task2_3 {
    public static void main(String[] args) {
        int[] array = {1, 3, 5, 7, 9, 11, 13, 15};
        printArray(array);
        invertArray(array);
        printArray(array);
    }
// создаем метод для печати массива
    public static void printArray(int[] array) {
        for (int j : array) {
            System.out.print(j + " ");
        }
        System.out.println();                           // отступ
    }
// создаем метод для инвертирования заданного массива
    public static void invertArray(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {    //находим середину
            int invert = array[array.length - i - 1];
            array[array.length - i - 1] = array[i];
            array[i] = invert;
        }
    }
}

