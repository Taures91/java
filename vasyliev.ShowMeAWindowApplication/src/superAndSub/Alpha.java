package superAndSub;

public class Alpha {
    // �������� ����:
    String name;

    // ����� ��� ����������� �������� ����:
    void show() {
        // �������� �������� �����:
        String txt ="��'��� ����� Alpha\n";
        txt +="���� name: "+name + "\n" ;
        for (int k = 1; k <= 20; k++) {
            txt +="�";
        }
        // ³���������� �����������:
        System.out.println(txt);
    }
}
