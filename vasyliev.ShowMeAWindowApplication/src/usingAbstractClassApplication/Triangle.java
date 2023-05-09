package usingAbstractClassApplication;

public class Triangle extends ColoredFigure{
    // �����������:
    Triangle(String clr,int s){
        // ������ ������������ ����������:
        super(clr,s);
    }
    // �������� ������������ ������ � ����������,
    // ���� ������� ����������� ����� ������:
    String getName(){
        return "���������";
    }
    // �������� ������������ ������ � ����������,
    // ���� ������� ����������� ����� ������:
    double getArea(){
        double k=Math.sqrt(3)/4;
        return size*size*k;
    }
}
