import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadingFilterWords {

    public List<String> text_filter() throws IOException{
        BufferedReader reader1 = new BufferedReader(new FileReader("src\\resources\\WordFilters.txt"));
        List<String> words = new ArrayList<>();
        String line2;
        while ((line2 = reader1.readLine()) != null) {
            words.add(line2);
        }
        reader1.close();
        return words;
    }
}
