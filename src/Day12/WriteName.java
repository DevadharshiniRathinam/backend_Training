package Day12;

import java.io.FileWriter;
import java.io.IOException;

public class WriteName {
    public static void main(String[] args) {
        String fileName = "Deva.txt";
        try  {
            FileWriter writer = new FileWriter(fileName);
            writer.write("Devadharshini");
        } catch (IOException e) {

            e.printStackTrace();
        }
    }
}

