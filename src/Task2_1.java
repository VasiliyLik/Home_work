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
        int i;
        for (i = 1; i < 10; i++) {
            if (array[i] < min) min = array[i];
            if (array[i] > max) max = array[i];
        }
        System.out.println("min value = " + min);
        System.out.println("max value = " + max);

        System.out.println();                   //вставка строки для отступа

        for (int j = 0; j < array.length; j++) {
            if (array[j] == min) array[j] = 0;
            if (array[j] == max) array[j] = 99;
        }
        System.out.println(Arrays.toString(array));
    }
}

