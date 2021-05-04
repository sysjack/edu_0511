/*
 * Дана коллекция имён.
 * 1) удалить все повторяющиеся имена из коллекции
 * 2) вывести коллекцию на экран
 * */

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class Main<myArrayList> {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> names = new ArrayList();

        names.add("Анатолий");
        names.add("Георгий");
        names.add("Руслан");
        names.add("Георгий");
        names.add("Павел");
        names.add("Руслан");

        ArrayList<String> newList = new ArrayList<>();
        for (String name : names) {
            if (!newList.contains(name)) {
                newList.add(name);

            }
        }
        for(String name : newList){
            System.out.println( name);
        }
    }
}
