// Создайте переменную типа String c любым текстом (не сильно короткое).
// Далее выведите на экран количество символов в данной строке.
// Далее разделите строку пополам, в результате у вас должно быть 2-е новых
// переменных типа String с частями из изначальной строки. Полученные строки выведите на экран.

public class Task1_1 {
    public static void main(String[] args) {
        String str = "home work";
        System.out.println(str.length());

        System.out.println();  //отделил первую часть задачки от другой пустой строкой

        for (String str2 : str.split(" ", 2)) {
            System.out.println(str2);
        }
    }
}