package superAndSub;

public class Bravo extends Alpha{
    // Цілочислове поле:
    int code;
    // Переозначення методу:
    void show(){
        // Локальна текстова змінна:
        String txt="Об'єкт класу Bravo\n";
        txt+="Поле name: "+name+"\n";
        txt+="Поле code: "+code+"\n";
        for(int k=1;k<=20;k++){
            txt+="—";
        }
        // Відображення повідомлення:
        System.out.println(txt);
    }
}
