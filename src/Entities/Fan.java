package Entities;

public class Fan implements Observer{
    private String name;

    public Fan(String name){
        this.name = name;
    }

    @Override
    public void update(String seriesName, int seasonNumber) {
        System.out.println("Olá "
                + name
                + ", uma nova temporada ("
                + seasonNumber
                + ") da série "
                + seriesName
                + " foi lançada!");
    }
}
