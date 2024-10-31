import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        try {
        System.out.println("Ingrese un numero");
        Integer num1 = scanner.nextInt();
        System.out.println("Ingrese otro numero");
        Integer num2 = scanner.nextInt();
            System.out.println(num1 / num2);
        } catch (InputMismatchException e) {
            System.err.println(e.getMessage());
        } catch (ArithmeticException e) {
            System.err.println(e.getMessage());
        } finally {
            System.out.println("terminar ejemplo");
        }

    }
}