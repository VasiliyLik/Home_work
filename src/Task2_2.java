// Создайте массив с 10-ю переменными целочисленного типа. Далее найдите дубликаты и выведите их количество.
//Пример: есть массив {2, 3, 5, 7, 6, 5, 7, 3, 7, 20} - в данном массиве цифра 3 и 7 повторяются.
//В результате выполнения программы на экран должно вывести:
//[3] - повторений 2
//[7] - повторений 3

public class Task2_2 {
    public static void main(String[] args) {
        final int[] array = {5, 1, 8, 2, 5, 8, 9, 5, 7, 10};

        int maxValue = array[0];

        for (int i = 0; i < array.length; i++) {
            if (maxValue < array[i]) {
                maxValue = array[i]; //находим максимальное число
            }
        }
        // создаем новый массив
        final int[] dublicateArray = new int[maxValue + 1];
        for (int i = 0; i < array.length; i++) {
            dublicateArray[array[i]] = dublicateArray[array[i]] + 1;
        }
        // поиск повторяющихся чисел
        for (int i = 0; i < dublicateArray.length; i++) {
            if (dublicateArray[i] > 1) {
                System.out.println("число " + i + " - повторений " + dublicateArray[i]);
            }
        }
    }
}
















