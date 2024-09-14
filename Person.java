
package com.mycompany.lab5;

public class Person {
    private String name;
    private int age;
    private String gender;
    private String address;

    // Constructor 
    public Person(String name, int age, String gender, String address) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
    }

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = "Unknown";
    }

    
    // Method to set address
    public void setAddress(String address) {
        this.address = address;
    }

    
    public void setAddress(String city, String country) {
        this.address = city + ", " + country;
    }

    public void display() {
        
        System.out.println("Person Details");
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Gender: " + this.gender);
        System.out.println("Address: " + this.address);
    }

    public static void main(String[] args) {
      
        // Using constructor overloading 
        Person person1 = new Person("Jisan", 25, "Male", "1205, Dhaka");
        person1.display();

        Person person2 = new Person("Kale", 25, "Male");
        person2.display();
        
        // Using method overloading for setAddress
        person2.setAddress("Dhaka");
        person2.display();
        person1.setAddress("Kulna", "Bangladesh");
        person1.display();
    }
}

