package com.revature;
import java.util.*;

public class PhoneBook {
    private static final HashMap<String, String> PHONE_NUMBERS = new HashMap<>() {
        {
            put("Ted Striker", "5551212");
            put("Roger Murdock", "3879812");
            put("Elaine Dickinson", "8675309");
            put("Jos de Vos", "016/161616");
        }
    };

    private HashMap<String, String> phoneBookEntries = PHONE_NUMBERS;

    PhoneBook() {

    }

    public HashMap<String, String> getPhoneBookEntries() {
        return phoneBookEntries;
    }

    public Optional<String> findPhoneNumberByName(String name) {
        List<String> names = phoneBookEntries.keySet().stream().toList();
        return names.stream().filter(p -> p.equals(name)).findFirst();
    }

    public Optional<String> findNameByPhoneNumber(String phoneNumber) {
        List<String> phoneNumbers = phoneBookEntries.values().stream().toList();
        return phoneNumbers.stream().filter(p -> p.equals(phoneNumber)).findFirst();
    }

    @Override
    public String toString() {
        System.out.println("Hello from PhoneBook's toString method");
        return "PhoneBook{" +
                "phoneBookEntries=" + phoneBookEntries + "}";
    }
    
}