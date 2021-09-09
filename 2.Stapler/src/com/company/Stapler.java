package com.company;

public class Stapler {

    private int myStaples;
    private static final int capacity = 50;
    private boolean isOpen;

    public Stapler() {
        myStaples = 0;
    }

    public Stapler(int staples) {
        if (staples > capacity) {
            myStaples = capacity;
            return;
        }
        myStaples = staples;
    }

    public void staple() {
        if (!isOpen) {
            if (myStaples >= 1) {
                myStaples = myStaples - 1;
                System.out.printf("Stapled! Remaining staples: %d%n", myStaples);
            } else System.out.println("No staples - add some!");
        } else System.out.println("Close the Staple first!");
    }


    public void addStaples(int addStaples) {
        if (isOpen) {
            if (myStaples + addStaples > capacity) {
                myStaples = capacity;
                return;
            } else myStaples += addStaples;

            System.out.printf("Added staples - Current staples %d%n", myStaples);
        } else System.out.println("Open the Staple first!");
    }

    public void openStaple() {
        this.isOpen = true;
    }

    public void closeStaple() {
        this.isOpen = false;
    }
}