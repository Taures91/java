package lesson11;

public class OopLessonRunner2 {
    public static void main(String[] args) {
        // создание новых объектов и их загрузка
//        Laptop laptop = new Laptop(new Ssd(250), new Ram(1024), 2);
//        laptop.load();
//        System.out.println();
//        Mobile mobile = new Mobile(new Ssd(125), new Ram(512));
//        mobile.load();

        //тоже создание объектов, только через родительский класс Компьютер
//        Computer laptop = new Laptop(new Ssd(250), new Ram(1024), 2);
//        laptop.load();
//        System.out.println();
//        Computer mobile = new Mobile(new Ssd(125), new Ram(512));
//        mobile.load();

        // Загрузка всех компьютеров и наследников с помощью метода loadComputers
        Computer laptop = new Laptop(new Ssd(250), new Ram(1024), 2);
        Computer mobile = new Mobile(new Ssd(125), new Ram(512));
        Laptop laptop1 = new Laptop(new Ssd(5000), new Ram(10000), 5);

//        loadComputers(laptop, mobile);
        printInfo(new Computer[]{laptop,mobile, laptop1});

    }
        public static void  printInfo (Computer[] computers){
            for (Computer computer:computers) {
                computer.print();
                if (computer instanceof Laptop){
                    ((Laptop) computer).open();
                }
                System.out.println();
            }
        }
    public static void loadComputers(Computer... computers){
        for (Computer computer : computers){
            computer.load();
            System.out.println();
        }
    }
}
