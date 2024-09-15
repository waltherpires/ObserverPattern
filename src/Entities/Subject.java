package Entities;

public interface Subject {

    // Os três métodos que interagem diretamente com os Observers
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}
