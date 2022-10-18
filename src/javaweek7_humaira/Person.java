package javaweek7_humaira;

public class Person {
    String firstName;
    String lastName;
    int age;

    public static void main(String[] args) {
        Person person = new Person();
        person.setFirstName(""); // firstName is set to empty string
        person.setLastName(""); // lastName is set to empty string
        person.setAge(10);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setFirstName("John"); // firstName is set to John
        person.setAge(18);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setLastName("Smith"); // lastName is set to Smith
        System.out.println("fullName= " + person.getFullName());

    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;

    }

    public int getAge() {
        return age;
    }

    public void setFirstName(String name) {
        this.firstName = name;
    }

    public void setLastName(String surname) {
        this.lastName = surname;
    }

    public void setAge(int xy) {
        if (xy < 1 || xy > 100){
            this.age = 0;
        } else { this.age = xy;}

    }

    public boolean isTeen() {
        if (age > 12 && age < 20) {
            return true;
        } else {return false;}

    }
    public String getFullName () {
        if (firstName.isEmpty()) {
            return lastName;
        } else if (lastName.isEmpty()) {
            return firstName;
        } else {
            return firstName + " " + lastName;
        }
    }
}


