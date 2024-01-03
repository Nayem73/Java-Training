package com.nayemtech;

public class Main {
    public static void main(String[] args) {
        Person Rahim = new Person("Rahim", 23);
        Person Karim = new Person("Karim", 33);

        System.out.println(Rahim.getName() + " " + Rahim.getAge());
        System.out.println(Karim.getName() + " " + Karim.getAge());

        Main main = new Main();
        Vehicle car = main.new Vehicle("Audi", 34000);
        System.out.println(car.name);
    }

    public class Vehicle {
        private String name;
        private int price;

        public Vehicle(String name, int price) {
            this.name = name;
            this.price = price;
        }

        public String getName() {
            return name;
        }
        public int getPrice() {
            return price;
        }
    }
}