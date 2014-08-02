package doremi.controler;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author João Carlos Luis Pereira
 *
 */
public class TXTPersist {

    public static void saveToFile(String texto, String local) throws IOException {
        FileWriter fileWriter = new FileWriter(new File(local));
        PrintWriter printWriter = new PrintWriter(fileWriter, true);
        printWriter.print(texto);
        printWriter.close();
        fileWriter.close();
    }

    public static String readFromFile(String local) throws Exception {
        String texto = "";
        FileReader fileReader = new FileReader(new File(local));
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        while (bufferedReader.ready()) {
            texto += (bufferedReader.readLine()) + '\n';
        }
        bufferedReader.close();
        fileReader.close();
        return (texto);
    }
}
