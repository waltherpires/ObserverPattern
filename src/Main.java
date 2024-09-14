import Entities.*;

public class Main {
    public static void main(String[] args) {

        Series serie1 = new Series("The Office");
        Series serie2 = new Series("Stranger Things");

        Fan fan1 = new Fan("Breno");
        Fan fan2 = new Fan("Daniel");
        Fan fan3 = new Fan("Marco");
        Fan fan4 = new Fan("Walther");

        serie1.addObserver(fan1);
        serie1.addObserver(fan2);

        serie2.addObserver(fan3);
        serie2.addObserver(fan4);

        serie1.releaseNewSeason(10);
        serie2.releaseNewSeason(5);
    }
}