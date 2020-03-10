package com.library;

import java.util.ArrayList;
import java.util.List;

public class Library {


        public static void main(String[] args) {

            List<Book> volume = new ArrayList<>();
                volume.add(new Book(1, "Java. Kompedium programisty", "Herbert Schildt", false ));
                volume.add(new Book(2, "Czysty kod", "Robert C. Martin", false ));
                volume.add(new Book(3, "Deep Learning","Josh Patterson", true ));

            List<Clients> client = new ArrayList<>();
                client.add(new Clients("Krzysztof", "Rycombel"));
                client.add(new Clients("Małgorzata", "Rycombel"));
                client.add(new Clients("Grzegorz", "Rycombel"));

           Book v = new Book(volume);

            v.showBooks();

           Clients c = new Clients(client);

            c.showClients();
        }
}
