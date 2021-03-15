import java.util.Scanner;

public class OperationsWithNumbers {
    public static int[] arab = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    public static String[] roman = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};


    public static void outputOnDisplay() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите данные:");
        String[] cell = scanner.nextLine().split(" ");
        int number1 = 0, number2 = 0;
        int isRoman1 = 0, isRoman2 = 0;
        boolean flag = false;
        String operation = " ";
        operation = cell[1];
        char operation2 = operation.charAt(0);
        for (int x = 0; x < roman.length; x++) {
            if (roman[x].equals(cell[0]) && roman[x].equals(cell[2])) {
                flag = true;
            }
            try {
                if (flag) {
                    number1 = ConversionOfNumbers.romanToArab(cell[0]);
                    number2 = ConversionOfNumbers.romanToArab(cell[2]);
                    System.out.println(ConversionOfNumbers.arabToRoman(Arithmetic.arithmetiOperations(number1, number2, operation2)));
                } else {
                    number1 = Integer.parseInt(cell[0]);
                    number2 = Integer.parseInt(cell[2]);
                    System.out.println(Arithmetic.arithmetiOperations(number1, number2, operation2));
                }
            } catch (IllegalArgumentException e) {
                if ((number1 > 10 || number1 < 1) || (number2 > 10 || number2 < 1)) {
                    throw new IllegalArgumentException();
                }
            }

        }

    }

}

