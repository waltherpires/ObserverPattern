import Entities.*;

public class Main {
    public static void main(String[] args) {

        // Séries criadas
        Series serie1 = new Series("The Office");
        Series serie2 = new Series("Stranger Things");


        // Fãs criados
        Fan fan1 = new Fan("Breno");
        Fan fan2 = new Fan("Daniel");
        Fan fan3 = new Fan("Marco");
        Fan fan4 = new Fan("Walther");

        // fãs adicionados como observers
        serie1.addObserver(fan1);
        serie1.addObserver(fan2);

        serie2.addObserver(fan3);
        serie2.addObserver(fan4);

        // novas temporadas lançadas
        serie1.releaseNewSeason(10);
        serie2.releaseNewSeason(5);
    }
}