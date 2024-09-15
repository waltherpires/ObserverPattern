package Entities;

public interface Observer {

    // Observer precisa ter o método update para ser compatível com o método notifyObservers da classe Series
    void update(String seriesName, int seasonNumber);
}