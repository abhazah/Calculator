import java.util.Arrays;

class arabToRome {
    static String RomeNum(String result) {
        String strResult = "";
        String[] arabNums = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
        String[] romeNumsUnits = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
        String[] romeNumsTens = {"X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        if (strResult.length() == 1) {
            int index = Arrays.asList(arabNums).indexOf(strResult);
            String arabNum = arabNums[index];
        }
        return null;
    }

}
