package com.mycompany.task_1_3_address;

/**
 * класс демонстрирующий демонстрацию методов класс Address
 */
public class Main {
    public static void main(String [] args) {
        Address address = new Address();
        address.set("  Россия  , Смоленская область  , Смоленск, Ленина, 1, А, 25");
        System.out.println(address);
        address.setByTokenizer("  Россия  , Смоленская область  . Смоленск, Ленина- 1. А; 25");
        System.out.println(address);
    }
}
