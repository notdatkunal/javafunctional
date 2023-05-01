package com.kunal;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static com.kunal.Main.Gender.*;

public class Main {
    public static void main(String[] args) {
        List<Person> people = List.of(
            new Person("Kunal",MALE),
            new Person("Akash",MALE),
            new Person("Shruti",FEMALE),
            new Person("Rutuja",FEMALE),
            new Person("Akanksha",FEMALE)

        );
        //Imperative Approach
        List<Person> females = new ArrayList<>();

        for (Person person:people) {
            if (FEMALE.equals(person.gender))
                females.add(person);
        }

        for (Person person:females) {
            System.out.println(person);
        }

        System.out.println("declarative approach");
        //Declarative approach
        people.stream().filter(person -> FEMALE.equals(person.gender)).collect(Collectors.toList()).forEach(System.out::println);



    }
    static class Person{
        private final String name;
        private final Gender gender;

        Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }
     enum Gender{
        MALE,FEMALE
    }

}
