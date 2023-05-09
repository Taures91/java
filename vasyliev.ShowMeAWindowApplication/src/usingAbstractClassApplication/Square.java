package usingAbstractClassApplication;

public class Square extends ColoredFigure{

        // Конструктор:
        Square(String clr,int s){
            // Виклик конструктора суперкласу:
            super(clr,s);
        }
        // Описання абстрактного методу з суперкласу,
        // який повертає результатом назву фігури:
        String getName(){
            return "квадрат";
        }
        // Описання абстрактного методу з суперкласу,
        // який повертає результатом площу фігури:
        double getArea(){
            double k=1;
            return size*size*k;
        }
}
