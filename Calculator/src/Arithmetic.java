
public class Arithmetic {
    public static int arithmetiOperations(int number1, int number2, char operation) throws  ValueException {
        if((number1 < 1) || (number1 > 10) || (number2 < 1) || (number2 > 10)) {
            throw new ValueException("Проверь введенное число");
        }
        int result = 0;
        switch (operation){
            case '+' : result = number1 + number2; break;
            case '-' : result = number1 - number2; break;
            case '*' : result = number1 * number2; break;
            case '/' : result = number1 / number2; break;
            default : throw new IllegalArgumentException("Неверный знак");
        }
        return result;
    }
}
