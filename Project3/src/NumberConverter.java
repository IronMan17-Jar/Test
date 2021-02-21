import java.util.Scanner;

public class NumberConverter  {

    public static String converter() {
        OperationsWithNumbers Numbers = new OperationsWithNumbers();
        System.out.println("Введите число:");
        Scanner sc = new Scanner(System.in);
        String value = sc.next();
        try {
            char c = value.charAt(0);
            if(Character.isDigit(c)){
            int intVal = Integer.parseInt(value);
                System.out.println("Римское число "+ Numbers.arabToRoman(intVal));
            }
            else {
                System.out.println("Арабское число "+ Numbers.romanToArab(value));
            }
        } catch (NumberFormatException e) {
            System.out.println("Неверный формат");
        }
        return value;

    }

}
