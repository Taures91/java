package lesson11;

public class OopLessonRunner3 {
    public static void main(String[] args) {
        Computer laptop = new Laptop(new Ssd(250), new Ram(1024), 2);
        Computer mobile = new Mobile(new Ssd(125), new Ram(512));
        Computer laptop1 = new Laptop(new Ssd(5000), new Ram(10000), 5);
//        print(laptop,mobile, laptop1);
        printWithRandom(laptop,mobile, laptop1);
    }
    public static void print(Printable...objects){
        for(Printable object : objects){
            object.print();
            System.out.println();
        }
    }

    public static void printWithRandom(Printable...objects){
        for(Printable object : objects){
            object.printWithRandom();
            System.out.println();
        }
    }
}
