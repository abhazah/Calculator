import java.io.IOException;
import java.util.Arrays;
//Проверка, что оба числа одновременно или арабские, или римские, и что в диапозоне от 1 до 10
class SystemsAndRangeCheck {
    static String[] listOfOperands(String[] expression) {
        String[] list = {};
        String[] arab_nums = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
        String[] rome_nums = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
        String num0 = "0";
        String num1 = "1";
        if (Arrays.asList(arab_nums).contains(expression[0])) num0 = "Арабские";
        if (Arrays.asList(arab_nums).contains(expression[1])) num1 = "Арабские";
        if (Arrays.asList(rome_nums).contains(expression[0])) num0 = "Римские";
        if (Arrays.asList(rome_nums).contains(expression[1])) num1 = "Римские";
        if (num0.equals("Арабские") & (num1.equals("Арабские"))) {
            list = new String[]{expression[0], expression[1], "Арабские"};
        } else if (num0.equals("Римские") & (num1.equals("Римские"))) {
            list = new String[]{expression[0], expression[1], "Римские"};
        } else {
            try {
                throw new IOException();
            } catch (IOException e) {
                System.out.println("Принимаются либо два АРАБСКИХ числа от 1 до 10, либо два РИМСКИХ числа от I до X");
                System.exit(0);
            }
        }
    return list;
    }
}
