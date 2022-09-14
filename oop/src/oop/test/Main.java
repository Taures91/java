package oop.test;

public class Main {
    public static void main(String[] args) {
        for (Country country:
             Country.values()) {
            System.out.println(country + ". Порядковый номер: " + country.number + ". Столица: " +
                    country.capital + ". По-русски: " + country.rusName);

        }
       Animal animal = Animal.CAT;
        System.out.println(animal.getTranslation());
        System.out.println(animal.toString());

        Season season = Season.autumn;
        System.out.println(season.getTemperature());





    }
}
