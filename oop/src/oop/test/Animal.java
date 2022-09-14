package oop.test;

public enum Animal {
    CAT("кошка"), DOG("собака"), FROG("лягушка");
    final String translation;

    Animal(String translation) {
        this.translation = translation;

    }
    public String getTranslation() {
        return translation;
    }
    public String toString (){
        return "Перевод на русский язык: " + translation;
    }
}
