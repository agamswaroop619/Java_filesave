public class Adapter{
    public static baseinterface getid (int c){
        baseinterface saveas = null;
                switch(c)
                {
                    case 1 -> {
                        saveas = new txthandler();
                    }
                    case 2 -> {
                        saveas = new csvhandler();
                    }
                    default -> {
                        System.out.println("Wrong Choice");
                    }
                }
                return saveas;
    }
}
