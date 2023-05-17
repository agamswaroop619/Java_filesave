// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.io.IOException;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) throws IOException {
        System.out.println("3.Multi-threaded (both at once)");
        Scanner in= new Scanner(System.in);
        System.out.println("Main Function started");
        System.out.println("Enter the string you want to enter");
        String s = in.next();
        System.out.println("Enter your Choice");
        System.out.println("1.Save as txt");
        System.out.println("2.Save as csv");
        System.out.println("3. Multi-threaded (both at once)");
        int choice = in.nextInt();
        if(choice==3)
        {
            Thread t1= new Thread(new Runnable() {
                @Override
                public void run() {
                    baseinterface client1 = Adapter.getid(1);
                    try {
                        client1.enterString(s);
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }
            });
            Thread t2= new Thread(new Runnable() {
                @Override
                public void run() {
                    baseinterface client1 = Adapter.getid(2);
                    try {
                        client1.enterString(s);
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }
            });
            t1.start();
            t2.start();
        }
        else {
            baseinterface client = Adapter.getid(choice);
            client.enterString(s);
        }
    }
}
