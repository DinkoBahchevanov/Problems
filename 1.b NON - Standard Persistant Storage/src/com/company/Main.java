package com.company;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        Storage storage = new Storage();

        storage.put("Baba", "Meca");
        storage.put("Kumcho", "Vulcho");
        System.out.println("Storage get Baba: " + storage.get("Baba"));
        System.out.println("Storage get Kumcho: " + storage.get("Kumcho"));
        System.out.println("Contains Baba?: " + storage.contains("Baba"));
        System.out.println("Contains Vulcho?: " + storage.contains("Kumcho"));
        System.out.println("Contains Vulcho?: " + storage.contains("Kumcho"));
        System.out.println("Remove baba?: " + storage.remove("Baba"));
        System.out.println("Contains Baba?: " + storage.contains("Baba"));
    }
}
