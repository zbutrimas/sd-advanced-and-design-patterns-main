package com.sd.advanced.coding.examples;

public class ExampleEncapsulation implements Example{
    @Override
    public void run() throws InterruptedException {
        System.out.println("Running from encapsulation");
        Person p = new Person();
    }

    private class Person {
        private String name;
        private String surname;
    }
}
