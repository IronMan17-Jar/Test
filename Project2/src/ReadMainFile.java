import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class ReadMainFile {

    public List<String> text_main() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("src\\resources\\BasicText.txt"));
        List<String> info = new ArrayList<>();
        String line;
        while ((line = reader.readLine()) != null) {
            String[] splited = line.split("\\s+");
            for (int i = 0; i < splited.length; i++) {
                info.add(splited[i]);
            }
        }
        reader.close();
        return info;
    }

}