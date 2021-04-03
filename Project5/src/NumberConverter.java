import java.util.InputMismatchException;
import java.util.Scanner;

public class NumberConverter {
    OperationsWithNumbers numbers = new OperationsWithNumbers();
    public String outputOnDisplay() throws ConvertationException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число для конвертирования:");
        String value = sc.next();
        if (checkNumber(value)) {
            try {
                char c = value.charAt(0);
                if (Character.isDigit(c)) {
                    int intVal = Integer.parseInt(value);
                    System.out.println("Вы ввели: " + numbers.arabToRoman(intVal));
                } else {
                    System.out.println("Вы ввели: " + numbers.romanToArab(value));
                }
            } catch (NumberFormatException e) {
                
                throw new ConvertationException("вы ввели не число!");
            }
        }
        return value;
    }

    private boolean checkNumber(String value) throws ConvertationException{
        try {
            int num = Integer.parseInt(value);
            if(num<=500){
                return true;
            }
            else {
                throw new ConvertationException("арабское число больше 500");
            }
        } catch (NumberFormatException e) {
            int num = numbers.romanToArab(value);
            if(num==0){
                throw new ConvertationException("ввели не верные данные!");
            }
            else if(num<=500){
                return true;
            }
            else {
                throw new ConvertationException("римское число больше 500");
            }
        }

    }

}
