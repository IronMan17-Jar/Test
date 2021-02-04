import java.io.*;
import java.util.*;

public class Message {

    public static void main(String[] args) throws Exception {

        PrintWriter pw = new PrintWriter("C:\\Users\\user\\Desktop\\TotalTurnedOut.txt");

        BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\user\\Desktop\\IlyasInfo.txt"));
        List <String> info = new ArrayList<>();
        String line;
        while ((line = reader.readLine()) != null) {
            String[] splited = line.split("\\s+");
            for (int i = 0; i < splited.length; i++) {
                info.add(splited[i]);
                //System.out.println(splited[i]);
            }
        }
        String[] splited = info.toArray(new String[info.size()]);
        reader.close();


        BufferedReader reader1 = new BufferedReader(new FileReader("C:\\Users\\user\\Desktop\\Words.txt"));
        List <String> words = new ArrayList<>();
        String line2;
        while ((line2 = reader1.readLine()) != null) {
            words.add(line2);
        }

        List <String> total = new ArrayList<>(info);
        total.removeAll(words);

        pw.println(total);
        System.out.println(total.toString().replaceAll("^\\[|\\]$", "").replaceAll(",",""));

        reader1.close();
        pw.close();

    }

}









