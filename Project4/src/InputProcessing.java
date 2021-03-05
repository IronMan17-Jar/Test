
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class InputProcessing {

    public static ArrayList<Integer> processing() throws IOException {

        ArrayList<Integer> number = new ArrayList<>();
        System.out.println("Введите число:");
        Scanner sc = new Scanner(System.in);
        String numberString = sc.nextLine();
        for (String s : numberString.split(" ")){

            if (sc.hasNextInt()) {
                int num = sc.nextInt();
                number.add(num);
            } else {

                String str = sc.nextLine();
                System.out.println(str + " не является числом!");
            }
        }
        return number;
    }

    public static void outputOnDisplay() throws IOException {
        ArrayList<Integer> number = processing();
        for (int x = 0; x < number.size(); x++) {
            //System.out.print("Вы ввели: "+number.get(x));
        }
        System.out.print("Вы ввели: "+number);
        }
    //replaceAll("^\\[|\\]$", "")
}