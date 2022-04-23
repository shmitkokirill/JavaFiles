package com.company;

import java.util.Objects;

public class Task3_Person {
    Task3_Person (String firstName, String lastName, String age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
    public String firstName;
    public String lastName;
    public String age;

   /* @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task3_Person person = (Task3_Person) o;
        return firstName == person.firstName && lastName == person.lastName &&
                age == person.age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, age);
    }
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Person{");
        sb.append("firstName='").append(firstName).append('\'');
        sb.append(", lastName='").append(lastName).append('\'');
        sb.append(", age=").append(age);
        sb.append('}');
        return sb.toString();
    }*/
}
