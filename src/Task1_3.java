//Имеется целое число (любое), это число — сумма денег в рублях.
// Вывести это число, добавив к нему слово «рублей» в правильном падеже.
public class Task1_3 {
    public static void main(String[] args) {
        int num = 555;
        int x = num % 10;
        if (num % 100 > 10 && num % 100 < 15)
            System.out.println(num + " рублей");
        else {
            switch (x) {
                case 0 -> System.out.println(num + " рублей");
                case 1 -> System.out.println(num + " рубль");
                case 2 -> System.out.println(num + " рубля");
                case 3 -> System.out.println(num + " рубля");
                case 4 -> System.out.println(num + " рубля");
                default -> System.out.println(num + " рублей");
            }
        }
    }
}
