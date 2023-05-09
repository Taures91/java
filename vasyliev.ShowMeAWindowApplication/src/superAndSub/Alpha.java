package superAndSub;

public class Alpha {
    // Текстове поле:
    String name;

    // Метод для відображення значення поля:
    void show() {
        // Локальна текстова змінна:
        String txt ="Об'єкт класу Alpha\n";
        txt +="Поле name: "+name + "\n" ;
        for (int k = 1; k <= 20; k++) {
            txt +="—";
        }
        // Відображення повідомлення:
        System.out.println(txt);
    }
}
