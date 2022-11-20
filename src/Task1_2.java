//Создайте любое число. Определите, является ли последняя цифра числа семеркой.
public class Task1_2 {
    public static void main(String[] args) {
        int num = 1897;
        if (num % 10 == 7) {
            System.out.println("Последняя цифра в числе " + num + " - равна 7");
        } else {
            System.out.println("Последняя цифра в числе " + num + " - не равна 7");
        }
    }
}

