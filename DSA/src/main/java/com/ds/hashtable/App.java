package com.ds.hashtable;

public class App {
    public static void main(String[] args) {
        HashTable table = new HashTable(50);
        table.insert("Apple1");
        table.insert("Apple2");
        table.insert("Apple3");
        table.insert("Apple4");
        table.insert("Apple5");
        table.insert("Apple6");
        table.insert("Apple7");
        table.insert("Apple8");
        table.insert("Apple9");
        table.insert("Apple10");
        table.insert("Apple11");
        table.insert("Apple12");
        table.insert("Apple13");
        table.insert("Apple14");
        table.insert("Apple15");
        table.insert("Apple16");
        table.insert("Apple17");
        table.insert("Apple18");
        table.insert("Apple19");

        table.displayTable();

        System.out.println("--------FIND ELEMENTS--------");
        System.out.println(table.find("Apple1"));
        System.out.println(table.find("Apple2"));
        System.out.println(table.find("Apple12"));
        System.out.println(table.find("Apple17"));
        System.out.println(table.find("Apple34"));
        System.out.println(table.find("Apple18"));
        System.out.println(table.find("Apple10"));


    }
}
