package lesson16;

public enum ProcessorType implements Describable{
    BIT_32("bit-32"),
    BIT_64("bit-64");
    private String name;

    ProcessorType(String name) {
        this.name = name;
    }
    @Override
    public String getDescription() {
        return null;
    }


    public String getName() {
        return name;
    }

}
