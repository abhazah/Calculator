import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String expression = scanner.nextLine();
        Calculation test = new Calculation();
        System.out.println(test.readyOperands(expression));
        }
    }