import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class txthandler extends baseinterface_abstractclass {
    @Override
    public void enterString(String s) throws IOException {
        System.out.println("TXT Initializing...");
        File f=new File("Textfile.txt");
        FileWriter fin = new FileWriter("Textfile.txt");
        fin.write(s);
        fin.close();
        System.out.println(c);
    }
}
