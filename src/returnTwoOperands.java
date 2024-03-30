import java.io.IOException;
//Проверка на наличие именно ДВУх операндов
class ReturnTwoOperands {
    static String[] operands(String expression) {
        returnSymbol symbol = new returnSymbol();
        String splitSighn = symbol.symbol(expression);
        String[] listOfOperands = expression.split(splitSighn);
        if (listOfOperands.length != 2) {
            try {
                throw new IOException();
            } catch (IOException e) {
                System.out.println("Необходимо ввести ДВА операнда");;
                System.exit(0);
            }
        }
    return listOfOperands;
    }
}
