import java.util.Arrays;
class Calculation {
    static String readyOperands(String expression) {
        returnSymbol operapor = new returnSymbol();
        String sign = operapor.symbol(expression);
        ReturnTwoOperands operand = new ReturnTwoOperands();
        String[] unknownList = operand.operands(expression);
        SystemsAndRangeCheck list = new SystemsAndRangeCheck();
        String[] correctList = list.listOfOperands(unknownList);
        int result = 0;
        String strReslult = "";
        if (correctList[2].equals("Арабские")) {
            int num1 = Integer.parseInt(correctList[0]);
            int num2 = Integer.parseInt(correctList[1]);
            if (sign.contains("+")) result = num1 + num2;
            if (sign.contains("-")) result = num1 - num2;
            if (sign.contains("/")) result = num1 / num2;
            if (sign.contains("*")) result = num1 * num2;
            strReslult = Integer.toString(result);
        } else {
            int[] arabNums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
            String[] arab_Nums = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
            String[] romeNums = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
            String[] romeNumsTens = {"X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
            int index1 = Arrays.asList(romeNums).indexOf(correctList[0]);
            int num1 = arabNums[index1];
            int index2 = Arrays.asList(romeNums).indexOf(correctList[1]);
            int num2 = arabNums[index2];
            if (sign.contains("+")) result = num1 + num2;
            if (sign.contains("-")) result = num1 - num2;
            if (sign.contains("/")) result = num1 / num2;
            if (sign.contains("*")) result = num1 * num2;
            String arabResult = Integer.toString(result);
            String stringUnits = "";
            String stringTens = "";
            if (arabResult.length() == 1) {
                stringUnits = arabResult.substring(0, 1);
                int indexUnits = Arrays.asList(arab_Nums).indexOf(stringUnits);
                strReslult = romeNums[indexUnits];
            } else if (arabResult.length() == 2) {
                if (!arabResult.substring(1, 2).equals("0")) {
                    stringUnits = arabResult.substring(1, 2);
                    int index = Arrays.asList(arab_Nums).indexOf(stringUnits);
                    stringTens = arabResult.substring(0, 1);
                    int indexTens = Arrays.asList(arab_Nums).indexOf(stringTens);
                    strReslult = romeNumsTens[indexTens] + romeNums[index];
                } else {
                    stringTens = arabResult.substring(0, 1);
                    int indexTens = Arrays.asList(arab_Nums).indexOf(stringTens);
                    strReslult = romeNumsTens[indexTens];
                }
            } else strReslult = "C";

                if (result < 1) {
                    try {
                        throw new Exception();
                    } catch (Exception e) {
                        System.out.println("Результат меньше единицы. В римской системе таких чисел нет");
                        System.exit(0);
                    }
                }
            }
        return strReslult;
    }

}
