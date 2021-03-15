import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InputProcessing {

    public static ArrayList<String> processing() throws IOException {


        System.out.println("Введите число:");
        Scanner sc = new Scanner(System.in);
        Pattern p = Pattern.compile("(\\b[\\d]*\\b)(\\D+)");
        Matcher m = p.matcher(sc.nextLine());
        ArrayList<String> number = new ArrayList<>();
        while (m.find()) {
            if (sc.hasNextLine()) {
                number.add(m.group(1));

            }
            if (sc.hasNextLine()) {
                System.out.println(m.group(2) + " не является числом!");
            }
        }
        return number;
    }

    public static void outputOnDisplay() throws IOException {
        ArrayList<String> number = processing();
        for (int x = 0; x < number.size(); x++) {
        }
        System.out.print("Вы ввели: " + number);
    }



    public static void main(String[] args) {


//        Scanner sc = new Scanner(System.in);
//        String input = sc.nextLine();
//        final var arrayOfElements = input.split(" ");
//        List<String> numbers = new ArrayList<>();
//        List<String> othersElements = new ArrayList<>();
//        for (String element : arrayOfElements) {
//            if (isNumber(element)) {
//                numbers.add(element);
//            } else {
//                othersElements.add(element);
//            }
//        }
//        System.out.println(numbers.toString());
    }

    private static boolean isNumber(int element) {
        int a = element + 1;
        System.out.println(a);
        return isNumber(a);
    }
}
