import java.util.Scanner;

public class Task1 {
    /*
    Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
    и возвращает введенное значение.
    Ввод текста вместо числа не должно приводить к падению приложения,
    вместо этого, необходимо повторно запросить у пользователя ввод данных.
     */
    public static void main(String[] args) {
        run();
    }
    public static Float run(){
        System.out.println("Введите дробное число типа float: ");
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        Float floatNumber = null;
        try {
            floatNumber = Float.parseFloat(string);

        } catch (NumberFormatException e) {
            System.err.println("Неправильный формат строки! Введите число, а не буквы! ");
        }

        return floatNumber;
    }
}
