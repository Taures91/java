package superAndSub;

public class Bravo extends Alpha{
    // ֳ��������� ����:
    int code;
    // ������������� ������:
    void show(){
        // �������� �������� �����:
        String txt="��'��� ����� Bravo\n";
        txt+="���� name: "+name+"\n";
        txt+="���� code: "+code+"\n";
        for(int k=1;k<=20;k++){
            txt+="�";
        }
        // ³���������� �����������:
        System.out.println(txt);
    }
}
