package com.sss.design;

interface Behavior {
    void print();
}

public enum Gender implements Behavior {
    Male {
        @Override
        public void print() {
            System.out.println("Male special behavior");
        }
    },
    Female;

    @Override
    public void print() {
        System.out.println("Common behavior");
    }

    public static void main(String[] args) {
        Gender.Male.print(); //Male special behavior
        Gender.Female.print();  //Common behavior
    }
}

