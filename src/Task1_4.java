//Имеется строка, которая содержит символы ? и символы #.
// Замените все символы ? на HELLO, а # - удалите. Результат вывести на экран."
public class Task1_4 {
    public static void main(String[] args) {
        String oldstring = "my? name# is# Vasiliy?";
        String newstring = oldstring.replace("?", "HELLO");
        String newstring2 = newstring.replace("#", "");

        System.out.println(newstring2);
    }
}
