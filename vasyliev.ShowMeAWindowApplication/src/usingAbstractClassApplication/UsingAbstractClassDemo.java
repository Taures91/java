package usingAbstractClassApplication;

public class UsingAbstractClassDemo {
    public static void main(String[] args) {
        // ��������� ��?����:
        Triangle T=new Triangle("��������",2); // ���������
        Square S=new Square("������",3);       // �������
        Circle C=new Circle("�����",1);        // ����
        // ³���������� ���������� ��� ��?���� �����
        // ��?���� ���� �������:
        System.out.println(
                "������������ ��?������ ������ �������");
        T.show();
        S.show();
        C.show();
        // ��?����� ����� ������������ ����������:
        ColoredFigure F;
        // ³���������� ���������� ��� ��?���� �����
        // ��?����� ����� ������������ ����������:
        System.out.println(
                "������������ ��?����� ����� ������������ ����������");
        F=T;      // ���������
        F.show();
        F=S;      // �������
        F.show();
        F=C;      // ����
        F.show();
    }
}
