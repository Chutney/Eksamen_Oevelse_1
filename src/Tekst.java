import java.util.ArrayList;

public class Tekst {

    ArrayList<String> tekstLinjer;

    public Tekst() {
        tekstLinjer = new ArrayList<>();
    }


    public void tiljøf(String tekst) {
        tekstLinjer.add(tekst);
    }

    public int findAntalUnikke() {
        ArrayList<String> tmpArray = new ArrayList<>();

        for (String x : tekstLinjer) {
            if(!tmpArray.contains(x)) {
                tmpArray.add(x);
            }
        }
        return tmpArray.size();
    }

}
