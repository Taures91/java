package usingAbstractClassApplication;

public class Square extends ColoredFigure{

        // �����������:
        Square(String clr,int s){
            // ������ ������������ ����������:
            super(clr,s);
        }
        // �������� ������������ ������ � ����������,
        // ���� ������� ����������� ����� ������:
        String getName(){
            return "�������";
        }
        // �������� ������������ ������ � ����������,
        // ���� ������� ����������� ����� ������:
        double getArea(){
            double k=1;
            return size*size*k;
        }
}
