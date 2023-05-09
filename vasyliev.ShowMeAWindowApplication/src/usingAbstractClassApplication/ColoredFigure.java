package usingAbstractClassApplication;

abstract class ColoredFigure {
    // Текстове поле (колір):
    String color;
    // Цілочислове поле (розмір):
    int size;
    // Конструктор:
    ColoredFigure(String clr,int s){
        // Присвоєння значень полям:
        color=clr;
        size=s;
    }
    // Метод для відображення інформації про об"єкт:
    void show(){
        // Колір і назва фігури:
        System.out.println("Фігура: "+color+" "+getName());
        // Характерний розмір:
        System.out.println("Характерний розмір ("+
                getSizeName()+"): "+size);
        // Площа:
        System.out.printf("Площа: %.3f\n",getArea());
        // Імпровізована ?лінія? із ?зірочок?:
        String line="";
        for(int k=1;k<=30;k++){
            line+="*";
        }
        System.out.println(line);
    }
    // Метод результатом повертає назву для параметра,
    // який визначає характерний розмір фігури:
    String getSizeName(){
        return "ребро";
    }
    // Абстрактні методи:
    abstract String getName(); // Назва фігури
    abstract double getArea(); // Площа фігури
}

