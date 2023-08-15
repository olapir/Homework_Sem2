import java.util.Scanner;

public class Task4 {
    /*Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
    Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
     */
    public static void main(String[] args) {
        System.out.println("Введите строку: ");
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();

        if (string.isEmpty()){
            throw new IllegalArgumentException("Строка пустая! Пустые строки вводить нельзя");
        }
        System.out.println(string);
    }
}
