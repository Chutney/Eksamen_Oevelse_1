import java.util.*;

public class Main {
    public static void main(String[] args) {

        Tekst tekst = new Tekst();

        tekst.tilj�f("Hallo");
        tekst.tilj�f("Hallo");

        System.out.print(tekst.findAntalUnikke());


    }
}