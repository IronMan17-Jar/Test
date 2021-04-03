


public class ConversionOfNumbers {

    private static int numberProcessing(char symbol){
        switch (symbol){
            case 'I' : return 1;
            case 'V' : return 5;
            case 'X' : return 10;
            case 'L': return 50;
            case 'C': return 100;
            default  : return -1;
        }

}
    public static int romanToArab(String operationsWithNumber) throws NumberFormatException{
        int intValue = 0;
        for(int x = 0; x<operationsWithNumber.length();x++){
            char ch = operationsWithNumber.charAt(x);
            int number = numberProcessing(ch);
            if(number==-1){
                throw new NumberFormatException("Недопустимый формат!");
            }
            intValue+=number;
        }
        return intValue;
    }


    public static String arabToRoman(int number){
        String romanVal = "";
        int N = number;
        while (N > 0) {
            for(int z = 0; z < OperationsWithNumbers.arab.length; z++){
                if(N<OperationsWithNumbers.arab[z]){
                    N-=OperationsWithNumbers.arab[z-1];
                    romanVal+=OperationsWithNumbers.roman[z-1];
                    break;
                }
            }
        }
        return romanVal;
    }
}
