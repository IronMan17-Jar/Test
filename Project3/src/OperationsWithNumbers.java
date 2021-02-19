


public class OperationsWithNumbers {
    private static int[] arab = {1, 4, 5, 9, 10, 50, 100, 500, 1000};
    private static String[] roman = {"I", "IV", "V", "IX", "X", "L", "C", "D", "M"};


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
            if(symbol == 'I'){ return 1; }
            else if(symbol == 'V'){return 5; }
            else if(symbol == 'X'){ return 10; }
            else if(symbol == 'L'){ return 50; }
            else if(symbol == 'C'){ return 100; }
            else if(symbol == 'D'){ return 500; }
            else if(symbol == 'M'){ return 1000; }
            else { return -1; }

        }
        public static String arabToRoman(int number){
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
