// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException {

        System.out.println("Main Function started");
        System.out.println("Enter your Choice");
        System.out.println("1.Save as txt");
        System.out.println("2.Save as csv");
        Scanner in= new Scanner(System.in);
        int choice = in.nextInt();
        baseinterface client = Adapter.getid(choice);
        System.out.println("Enter the string you want to enter");
        String s = in.next();
        client.enterString(s);

    }
}


