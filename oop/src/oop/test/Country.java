package oop.test;

public enum Country {
    Ukraine(1, "Украина", "Киев"),
    GreatBritain(2, "Великобритания", "Лондон");
    int number;
    String rusName;
    String capital;

    Country(int number, String rusName, String capital) {
        this.number = number;
        this.rusName = rusName;
        this.capital = capital;
    }

}
