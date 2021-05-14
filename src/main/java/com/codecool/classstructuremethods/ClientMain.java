package com.codecool.classstructuremethods;

public class ClientMain {
    public static void main(String[] args) {
        Client client = new Client();
        client.setName("Ödi");
        client.setYear(1993);
        client.setAddress("Vág utca");

        System.out.println("Name: " + client.getName());
        System.out.println("Year: " + client.getYear());
        System.out.println("Address: " + client.getAddress());

        client.migrate("Téglagyártó út");
        System.out.println("Client's new address is: " + client.getAddress());
    }
}
