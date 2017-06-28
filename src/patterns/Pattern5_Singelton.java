package patterns;

public class Pattern5_Singelton {
    public static void main(String[] args) {
        Singelton singelton = Singelton.getInstance();
    }
}

class Singelton {
   static Singelton singelton = new Singelton();

    public static Singelton getInstance() {
        return singelton;
    }

    private Singelton() {

    }
}
