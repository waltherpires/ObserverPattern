package Entities;

import java.util.ArrayList;
import java.util.List;

public class Series implements  Subject{
    private List<Observer> observers = new ArrayList<>();
    private String name;
    private int seasonNumber;

    public Series(String name) {
        this.name = name;
    }

    public void releaseNewSeason(int seasonNumber){
        this.seasonNumber = seasonNumber;
        notifyObservers();
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.add(observer);
    }

    public void notifyObservers(){
        for(Observer observer : observers) {
            observer.update(name, seasonNumber);
        }
    }
}
