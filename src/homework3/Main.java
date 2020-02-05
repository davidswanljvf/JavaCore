package homework3;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        String[] strings = {"Rick", "Morty", "Sam", "Rick", "Rick", "Rick", "Sam", "Sam", "Rick", "Cat", "Rick", "Morty", "Cat", "Morty"};
        // решение с использованием getOrDefault
        HashMap<String, Integer> hashMap1 = new HashMap<>();
        for (int i = 0; i < strings.length; i++) {
            if (!hashMap1.containsKey(strings[i])) {
                hashMap1.put(strings[i], 1);
            } else
                hashMap1.put(strings[i], hashMap1.getOrDefault(strings[i], 0) + 1);
        }
        // решение с использованием get
        HashMap<String, Integer> hashMap2 = new HashMap<>();
        for (int i = 0; i < strings.length; i++) {
            if (!hashMap2.containsKey(strings[i])) {
                hashMap2.put(strings[i], 1);
            } else hashMap2.put(strings[i], hashMap2.get(strings[i]) + 1);
        }
        System.out.println("1. Уникальные слова:"
                + "\n" + "\u001B[32m" + " 1.1 " + hashMap1
                + "\n" + "\u001B[34m" + " 1.2 " + hashMap2+ "\n"
                + "\n" + "\u001B[0m" + "2. Телефонный спаровчник:");

        Phonebook phonebook = new Phonebook();
        phonebook.add("Rick", "+79256554465");
        phonebook.add("Morty", "345636");
        phonebook.add("Sam", "123567");
        phonebook.add("Deil", "907678");
        phonebook.add("Rick", "+7(943)000-55-15");
        phonebook.add("Cat", "234567");
        phonebook.add("Rick", "23566");

        System.out.println(phonebook.get("Rick"));
    }
}