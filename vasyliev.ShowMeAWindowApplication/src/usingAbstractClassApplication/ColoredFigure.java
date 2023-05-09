package usingAbstractClassApplication;

abstract class ColoredFigure {
    // �������� ���� (����):
    String color;
    // ֳ��������� ���� (�����):
    int size;
    // �����������:
    ColoredFigure(String clr,int s){
        // ��������� ������� �����:
        color=clr;
        size=s;
    }
    // ����� ��� ����������� ���������� ��� ��"���:
    void show(){
        // ���� � ����� ������:
        System.out.println("Գ����: "+color+" "+getName());
        // ����������� �����:
        System.out.println("����������� ����� ("+
                getSizeName()+"): "+size);
        // �����:
        System.out.printf("�����: %.3f\n",getArea());
        // ������������ ?���? �� ?������?:
        String line="";
        for(int k=1;k<=30;k++){
            line+="*";
        }
        System.out.println(line);
    }
    // ����� ����������� ������� ����� ��� ���������,
    // ���� ������� ����������� ����� ������:
    String getSizeName(){
        return "�����";
    }
    // ��������� ������:
    abstract String getName(); // ����� ������
    abstract double getArea(); // ����� ������
}

