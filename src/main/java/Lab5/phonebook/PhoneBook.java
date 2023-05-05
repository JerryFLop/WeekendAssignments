package Lab5.phonebook;

import java.util.*;
//import java.util.HashMap;

/**
 * Created by leon on 1/23/18.
 * Made WAY better by kristofer 6/16/20
 */
public class PhoneBook {

    private final Map<String, List<String>> phonebook;

    public PhoneBook(Map<String, List<String>> map) {
        this.phonebook = new LinkedHashMap<>(map);
    }

    public PhoneBook() {
        this(new LinkedHashMap<>());
    }


    public void add(String name, String phoneNumber) {
        if (!phonebook.containsKey(name)) {
            phonebook.put(name, new ArrayList<>());
        }
        phonebook.get(name).add(phoneNumber);
    }

    public void addAll(String name, String... phoneNumbers) {
        List<String> contacts = phonebook.computeIfAbsent(name, key -> new ArrayList<>());

        contacts.addAll(Arrays.asList(phoneNumbers));
    }


    public void remove(String name) {
        phonebook.remove(name);
    }

    public Boolean hasEntry(String name) {
        return phonebook.containsKey(name);
    }

    public List<String> lookup(String name) {

        return phonebook.get(name);
    }

    public String reverseLookup(String phoneNumber) {

        for (Map.Entry<String,List<String>> entry : phonebook.entrySet()){
                if (entry.getValue().contains(phoneNumber)){
                return entry.getKey();
                }
             }
      return  null ;
    }

    public List<String> getAllContactNames() {
        List<String> ContactNames = new ArrayList<>();
        for (String name : phonebook.keySet()) {
            ContactNames.add(name);                }

        return ContactNames;

    }

    public Map<String, List<String>> getMap() {


        return phonebook;


    }

}