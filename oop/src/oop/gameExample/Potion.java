package oop.gameExample;

public class Potion {
    public String type;
    public int volume;
    public String strength;
    public String colour;

    public Potion(String type, int volume, String strength, String colour) {
        this.type = type;
        this.volume = volume;
        this.strength = strength;
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "Potion{" +
                "type='" + type + '\'' +
                ", volume=" + volume +
                ", strength='" + strength + '\'' +
                ", colour='" + colour + '\'' +
                '}';
    }
}
