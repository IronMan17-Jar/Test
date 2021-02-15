import java.io.*;
import java.util.*;

public class TotalRecord {

    public static void main(String[] args) throws Exception {
        ReadMainFile read1 = new ReadMainFile();
        ReadingFilterWords read2 = new ReadingFilterWords();

        PrintWriter pw = new PrintWriter("src\\resources\\FinalText.txt");
        List <String> total = new ArrayList<String>(read1.text_main());
        total.removeAll(read2.text_filter());
        pw.println(total);
        System.out.println(total.toString().replaceAll("^\\[|\\]$", "").replaceAll(",",""));
        pw.close();
    }
}









