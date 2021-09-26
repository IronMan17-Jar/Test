import java.util.Scanner;

public class OperationsWithNumbers {
    public int[] arab = {1, 4, 5, 9, 10, 50, 100, 500, 1000};
    public String[] roman = {"I", "IV", "V", "IX", "X", "L", "C", "D", "M"};

    public  void outputOnDisplay() throws ValueException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите данные:");
        String[] cell = scanner.nextLine().split(" ");
        int first = 0;
        int second = 0;
        String operation = " ";
        operation = cell[1];
        char operation2 = operation.charAt(0);
            try {
                    first = Integer.parseInt(cell[0]);
                    second = Integer.parseInt(cell[2]);
                    System.out.println(Arithmetic.arithmetiOperations(first, second, operation2));

            } catch (IllegalArgumentException | ValueException e) {
                first = ConversionOfNumbers.romanToArab(cell[0]);
                second = ConversionOfNumbers.romanToArab(cell[2]);
                System.out.println(ConversionOfNumbers.arabToRoman(Arithmetic.arithmetiOperations(first, second, operation2)));
            }
    }
}
