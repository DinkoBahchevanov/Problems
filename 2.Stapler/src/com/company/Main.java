package com.company;

public class Main {

    public static void main(String[] args) {
        Stapler stapler = new Stapler();

        stapler.staple();
        stapler.addStaples(1);
        stapler.openStaple();
        stapler.addStaples(1);
        stapler.staple();
        stapler.closeStaple();
        stapler.staple();
        stapler.staple();
        stapler.openStaple();
        stapler.addStaples(60);
        stapler.closeStaple();
        stapler.staple();

        System.out.println("\nHave a great day stapling different stuff :)");
    }
}
