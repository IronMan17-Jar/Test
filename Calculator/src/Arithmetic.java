

public class Arithmetic {


    public static int arithmetiOperations(int number1, int number2, char operatoin){
        int result = 0;
        switch (operatoin){
            case '+' : result = number1 + number2; break;
            case '-' : result = number1 - number2; break;
            case '*' : result = number1 * number2; break;
            case '/' : result = number1 / number2; break;
            default : throw new IllegalArgumentException("Неверный знак");
        }
        return result;
    }
}
