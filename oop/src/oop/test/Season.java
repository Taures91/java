package oop.test;

public enum Season {
    winter(-10), spring(10), summer(20), autumn(15);
    private int temperature;

    Season(int temperature) {
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }
}
