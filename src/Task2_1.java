import java.util.Arrays;

//Создайте массив с 10-ю переменными целочисленного типа. Используя оператор ""for"",
// найдите и выведите на экран наименьшее и наибольшее значение в массиве.
//min value =  ""значение которое у вас получилось"".
//max value =  ""значение которое у вас получилось"".
//Далее замените наименьшее значение на 0, а наибольшее значение на 99 и выведите получившийся массив на экран в виде:
//[23, 0, 34, 99, 43534].
public class Task2_1 {
    public static void main(String[] args) {
        int[] array = {12, 23, 9, 56, 765, 3, 81, 435, 827, 115};
        int min, max;
        min = max = array[0];

        int indexOfMin = 0, indexOfMax = 0;

        for (int i = 1; i < 10; i++) {
            if (array[i] < min) min = array[i];
            if (array[i] < array[indexOfMin]) {  // находим индекс min
                indexOfMin = i;
            }

            if (array[i] > max) max = array[i];
            if (array[i] > array[indexOfMax]) {  // находим индекс max
                indexOfMax = i;
            }
        }
        System.out.println("min value = " + min + ", индекс " + indexOfMin);
        System.out.println("max value = " + max + ", индекс " + indexOfMax);

        System.out.println();                   //вставка строки для отступа

        array[indexOfMin] = 0;                  //замена индекса min
        array[indexOfMax] = 99;                 //замена индекса max

        System.out.println(Arrays.toString(array));
    }
}

