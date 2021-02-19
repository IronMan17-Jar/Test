import java.util.Scanner;

public class NumberConverter {

    static OperationsWithNumbers Numbers = new OperationsWithNumbers();

    public static void main(String[] args) {

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

    }

}
