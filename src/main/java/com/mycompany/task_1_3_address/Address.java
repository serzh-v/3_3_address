package com.mycompany.task_1_3_address;

import java.util.StringTokenizer;

/**
 * класс задающий представление о том, как выглядит адрес человека
 */
public class Address {
    public String country;
    public String region;
    public String city;
    public String street;
    public String house;
    public String building;
    public String apartment;
    
    
    public Address(String country, String region, String city, String street, String house, String building, String apartment){
        this.country = country;
        this.region = region;
        this.city = city;
        this.street = street;
        this.house = house;
        this.building = building;
        this.apartment = apartment;
    }
    
    public Address() {
        
    }
    
    //метод, задающий адрес
    //в качестве разделителей только запяятые
    //trim на случай лишних пробелов
    public void set(String address) {
        String[] parts = address.split(",");
        this.country = parts[0].trim();
        this.region = parts[1].trim();
        this.city = parts[2].trim();
        this.street = parts[3].trim();
        this.house = parts[4].trim();
        this.building = parts[5].trim();
        this.apartment = parts[6].trim();
    }
    
    //метод задающий адрес и учитывающий уже все разделители
    public void setByTokenizer(String address) {
        StringTokenizer tokenizer = new StringTokenizer(address, ".,;-");
        String[] parts = new String[tokenizer.countTokens()];
        for (int i = 0; i < parts.length; i++) {
            parts[i] = tokenizer.nextToken();
        }
        this.country = parts[0].trim();
        this.region = parts[1].trim();
        this.city = parts[2].trim();
        this.street = parts[3].trim();
        this.house = parts[4].trim();
        this.building = parts[5].trim();
        this.apartment = parts[6].trim();
    }
    
    //метод выводящий на экран строковое представление адреса
    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append(country).append(", ");
        s.append(region).append(", ");
        s.append(city).append(", ");
        s.append(street).append(", ");
        s.append(house).append(", ");
        s.append(building).append(", ");
        s.append(apartment);
        return s.toString();
    }
}
