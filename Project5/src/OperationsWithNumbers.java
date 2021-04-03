



public class OperationsWithNumbers {
    private int[] arab = {1, 4, 5, 9, 10, 50, 100, 500, 1000};
    private String[] roman = {"I", "IV", "V", "IX", "X", "L", "C", "D", "M"};

    public int romanToArab(String operationsWithNumbers) throws NumberFormatException {
            int result = 0;
            String num = operationsWithNumbers;
            for(int i = 0;i < num.length() - 1;i++) {
                if (numberProcessing(num.charAt(i)) < numberProcessing(num.charAt(i+1))) {
                    result -= numberProcessing(num.charAt(i));
                } else {
                    result += numberProcessing(num.charAt(i));
                }
            }
            result += numberProcessing(num.charAt(num.length()-1));
            return result;
    }
    private int numberProcessing(char roman){
        switch(roman) {
            case 'M': return 1000;
            case 'D': return 500;
            case 'C': return 100;
            case 'L': return 50;
            case 'X': return 10;
            case 'V': return 5;
            case 'I': return 1;
            default: return 0;
        }

    }
    public String arabToRoman(int number){
        String romanVal = "";
        int N = number;
        while (N > 0) {
            for(int z=0;z<arab.length;z++){
                if(N<arab[z]){
                    N-=arab[z-1];
                    romanVal+=roman[z-1];
                    break;
                }
            }
        }
        return romanVal;
    }
}
