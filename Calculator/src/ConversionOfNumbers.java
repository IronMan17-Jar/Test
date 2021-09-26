
public class ConversionOfNumbers {

    static OperationsWithNumbers ow1 = new OperationsWithNumbers();

    public static int romanToArab(String operationsWithNumbers) throws NumberFormatException {
        int intValue = 0;

        for(int x = 0; x<operationsWithNumbers.length();x++){
            char ch = operationsWithNumbers.charAt(x);
            int number = numberProcessing(ch);
            if(number==-1){
                throw new NumberFormatException("Недопустимый формат!");
            }
            intValue+=number;
        }
        return intValue;

    }
    private static int numberProcessing(char symbol){
        switch (symbol) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return -1;
        }
    }
    public static String arabToRoman(int number){
        String romanVal = "";
        int N = number;
        while (N > 0) {
            for(int z=0;z<ow1.arab.length;z++){
                if(N<ow1.arab[z]){
                    N-=ow1.arab[z-1];
                    romanVal+=ow1.roman[z-1];
                    break;
                }
            }
        }
        return romanVal;
    }
}


