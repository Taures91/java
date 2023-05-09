package usingAbstractClassApplication;

public class Circle extends ColoredFigure{
    // Конструктор:
    Circle(String clr,int s){
        // Виклик конструктора суперкласу:
        super(clr,s);
    }
    // Описання абстрактного методу з суперкласу,
    // який повертає результатом назву фігури:
    String getName(){
        return "коло";
    }
    // Описання абстрактного методу з суперкласу,
    // який повертає результатом площу фігури:
    double getArea(){
        double k=Math.PI;
        return size*size*k;
    }
    // Переозначення методу, який повертає результатом
    // назву для параметра, котрий визначає характерний
    // розмір системи:
    String getSizeName(){
        return "радіус";
    }
}
