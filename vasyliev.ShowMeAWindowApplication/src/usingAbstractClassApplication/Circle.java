package usingAbstractClassApplication;

public class Circle extends ColoredFigure{
    // �����������:
    Circle(String clr,int s){
        // ������ ������������ ����������:
        super(clr,s);
    }
    // �������� ������������ ������ � ����������,
    // ���� ������� ����������� ����� ������:
    String getName(){
        return "����";
    }
    // �������� ������������ ������ � ����������,
    // ���� ������� ����������� ����� ������:
    double getArea(){
        double k=Math.PI;
        return size*size*k;
    }
    // ������������� ������, ���� ������� �����������
    // ����� ��� ���������, ������ ������� �����������
    // ����� �������:
    String getSizeName(){
        return "�����";
    }
}
