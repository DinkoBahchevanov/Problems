package com.company;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        Storage storage = new Storage();

        storage.put("Baba", "Meca");
        storage.put("Kumcho", "Vulcho");
        System.out.println(storage.contains("Baba"));
        System.out.println(storage.contains("Kumcho"));
        System.out.println(storage.get("Baba"));
        System.out.println(storage.get("Kumcho"));
        System.out.println(storage.remove("Baba"));
        System.out.println(storage.contains("Baba"));
    }
}
