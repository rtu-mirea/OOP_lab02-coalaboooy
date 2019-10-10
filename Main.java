package com.sanya.University;

public class Main {

    public static void main(String[] args) {
        System.out.println("Работа с классом String\n");
        System.out.println("Имена переменных, использовавшихся в коде:\n"+String1.getIdentifiers());
        System.out.println("Количество присвоений в коде:\n"+String1.getEquals());
        System.out.println("Тип максимальной переменной:\n"+String1.getMax());
        System.out.println("\nРабота с классом StringBuilder\n");
        System.out.println("Удаление всех символов кроме операторов присваивания:\n"+StringBuilder2.deletion());
        System.out.println("Добавление строки к исходному тексту:\n"+StringBuilder2.summary());
        System.out.println("Изменение первого оператора присваивания:\n"+StringBuilder2.modify());
        System.out.println("\nРабота с регулярными выражениями\n");
        System.out.println("Есть ли в слове "+RegEx3.test_word_false+" две идущих подряд одинаковые буквы:\n"+RegEx3.isTwo(RegEx3.test_word_false));
        System.out.println("Есть ли в слове "+RegEx3.test_word_true+" две идущих подряд одинаковые буквы:\n"+RegEx3.isTwo(RegEx3.test_word_true));
        System.out.println("Удаление из предложения всех слов с двумя идущими подряд одинаковыми буквами:\n"+RegEx3.deletion());
    }
}
