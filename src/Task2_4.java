// Написать программу, определяющую образуют ли цифры некоторого числа строго возрастающую последовательность.
// Например: 123 – образуют, 212 – не образуют.
public class Task2_4 {
    public static void main(String[] args) {
        aVoid(563);
    }

    public static void aVoid(int number) {
        int len = String.valueOf(Math.abs(number)).length();//Узнать длинну числа (если число 12345678 - будет 8)

        int temp_number = number;//создать переменную для теста
        int[] a1 = new int[len];//создать массив с длинной указанной в len

        for (int i = len - 1; i > -1; i--) {//заполнить массив с конца

            a1[i] = temp_number % 10;//присвоить остаток от деления этому числу
            //temp_number -= (temp_number%10);//остаток от деления записать в последний элемент массива, потом в пред последний и тд
            temp_number /= 10;//разделить число на 10 что бы дальше считать остатки от деления
        }
        boolean flag = true;
        for (int i = 0; i < a1.length - 1; i++) {
            if (a1[i] < a1[i + 1])
                flag = true;

            else {
                flag = false;
                break;
            }
        }
        if (flag == false) {
            System.out.println(number + "-  не образуют");
        } else {
            System.out.println(number + " - образуют");
        }
    }
}





