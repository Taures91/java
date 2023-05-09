package usingAbstractClassApplication;

public class Triangle extends ColoredFigure{
    // Конструктор:
    Triangle(String clr,int s){
        // Виклик конструктора суперкласу:
        super(clr,s);
    }
    // Описання абстрактного методу з суперкласу,
    // який повертає результатом назву фігури:
    String getName(){
        return "трикутник";
    }
    // Описання абстрактного методу з суперкласу,
    // який повертає результатом площу фігури:
    double getArea(){
        double k=Math.sqrt(3)/4;
        return size*size*k;
    }
}
