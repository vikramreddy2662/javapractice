package JavaPractice;

class Address {
    String country;  // Follow Java naming conventions
    String state;
    int roadNo;      // Follow Java naming conventions

    Address(String country, String state, int roadNo) {
        this.country = country;
        this.state = state;
        this.roadNo = roadNo;
    }
}

public class Student44 {
    String name;
    int age;
    Address address;

    Student44(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address.country + ", " + address.state + ", Road No: " + address.roadNo);
    }

    public static void main(String[] args) {
        Address address = new Address("India", "Telangana", 5);
        Address address1 = new Address("USA", "New York", 7);

        Student44 s = new Student44("Vikram", 12, address);
        Student44 s1 = new Student44("Vikas", 22, address1);

        s.display();
        s1.display();
    }
}