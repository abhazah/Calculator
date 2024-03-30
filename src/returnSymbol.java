import java.io.IOException;
//Проверка на наличие символов "+", "-", "/", "*"
class returnSymbol {
    static String symbol(String expression) {
        int i = 0;
        String operator = "";
        if (expression.contains("+")) {
            i += 1;
            operator = "\\+";
        }
        if (expression.contains("-")) {
            i += 1;
            operator = "\\-";
        }
        if (expression.contains("/")) {
            i += 1;
            operator = "\\/";
        }
        if (expression.contains("*")) {
            i += 1;
            operator = "\\*";
        }
        if (i != 1) {
            try {
                throw new IOException();
            } catch (IOException e) {
            }
            System.out.println("Необходимо ввести ОДИН оператор");
            System.exit(0);
        }
        return operator;
    }
}
