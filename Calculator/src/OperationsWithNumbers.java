import java.util.Arrays;
import java.util.Scanner;

public class OperationsWithNumbers {
    public static int[] arab = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    public static String[] roman = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};

    public static void outputOnDisplay() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите данные:");
        String[] cell = scanner.nextLine().split(" ");
        int first = 0;
        int second = 0;
        String operation = " ";
        operation = cell[1];
        char operation2 = operation.charAt(0);
        if (checkData(cell)) {
            try {
                    first = Integer.parseInt(cell[0]);
                    second = Integer.parseInt(cell[2]);
                    System.out.println(Arithmetic.arithmetiOperations(first, second, operation2));

            } catch (IllegalArgumentException e) {
                first = ConversionOfNumbers.romanToArab(cell[0]);
                second = ConversionOfNumbers.romanToArab(cell[2]);
                System.out.println(ConversionOfNumbers.arabToRoman(Arithmetic.arithmetiOperations(first, second, operation2)));
            }
        }

    }
    private static boolean checkData(String[] cell) {
        if (cell.length != 3) {
            return false;
        }
        checkOperation(cell);
        checkFirstAndSecond(cell);
        checkNumbers(cell);
        return true | false;
    }

    /*private static boolean checkFirst(String[] cell){
        String first = cell[0];
        String second = cell[2];
        if(cell[0].equals(roman) && cell[2].equals(roman)){
            return true;
        }
        else{
            return false;
        }
    }

    private static boolean checkSecond(String[] cell){
        String first = cell[0];
        String second = cell[2];
        if(cell[0].equals(arab) && cell[2].equals(arab)){
            return true;
        }
        else {
            return false;
        }
    }*/

    private static boolean checkFirstAndSecond(String[] cell){

        if (Arrays.asList(cell[0]).contains(arab) && Arrays.asList(cell[2]).contains(arab)) {
            return true;
        }
        else if (Arrays.asList(cell[0]).contains(roman) && Arrays.asList(cell[2]).contains(roman)) {
            return true;
        } else {
            return false;
        }
    }

    private static boolean checkOperation(String[] cell){
        String operation = cell[1];
        if(operation != "+" || operation != "-" || operation != "*" || operation != "/"){
            return false;
        }
        return true;
    }
    private static boolean checkNumbers(String[] cell){

        for(String x : cell) {
            try {
                int first = ConversionOfNumbers.romanToArab(cell[0]);
                int second = ConversionOfNumbers.romanToArab(cell[2]);
                if ((first <= 10 || first >= 1) && (second <= 10 || second >= 1)) {
                    return false;
                } else {
                    return true;
                }
            }
            catch (IllegalArgumentException e){
                int first = Integer.parseInt(cell[0]);
                int second = Integer.parseInt(cell[2]);
                if ((first <= 10 && first >= 1) && (second <= 10 && second >= 1)) {
                    return true;
                } else {
                    return false;
                }
            }
        }
        return true;

    }
}
