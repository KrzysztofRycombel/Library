package com.library;

import java.util.ArrayList;
import java.util.List;

public class Clients {

    public String name;
    public String surname;

    public Clients(String name, String surname) {

        this.name = name;
        this.surname = surname;
    }
    List<Clients> client = new ArrayList<>();

    public  Clients(List<Clients> client){
        this.client=client;
    }

    public void showClients() {
        for(Clients i : client) {
            i.showClient();
        }
    }
    public void showClient() {
        System.out.println("Imie: "+ name+"\tNazwisko: "+surname);
    }
}
