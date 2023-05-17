import java.io.*;
public class csvhandler extends baseinterface_abstractclass{
    @Override
    public void enterString(String s) throws IOException {
        System.out.println("CSV Initializing...");
        File f=new File("Csvfile.csv");
        FileWriter fin = new FileWriter("Csvfile.csv");
        fin.write(s);
        fin.close();
    }
}
