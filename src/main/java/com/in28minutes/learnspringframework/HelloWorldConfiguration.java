package com.in28minutes.learnspringframework;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record Person(String name, int age, Address address){};
record Address(String firstLine, String city){};
@Configuration
public class HelloWorldConfiguration {

    @Bean
    public String name(){
        return  "Daya Thapa";
    }

    @Bean
    public int age() {
        return 27;
    }

    @Bean
    public Person person() {
        var person = new Person("Ravi", 20, new Address("Main Street", "New York"));
        return person;
    }

    @Bean
    public Person person2MethodCall() {
        var person = new Person(name(), age(), address());
        return person;
    }

    @Bean
    public Person person3Parameters(String name, int age, Address address3) {
        var person = new Person(name, age, address3);
        return person;
    }

    //available: expected single matching bean but found 2: address2,address3
    //Making one of address primary primary
    @Bean
    @Primary
    public Person person4Parameters(String name, int age, Address address) {
        var person = new Person(name, age, address);
        return person;
    }

    @Bean
    public Person person5Qualifier(String name, int age,@Qualifier("address3qualifier") Address address) {
        var person = new Person(name, age, address);
        return person;
    }

    // Customise the name of the bean
    @Bean(name = "address2")
    @Primary
    public Address address() {
        var address = new Address("Baker Street", "London");
        return address;
    }

    @Bean(name = "address3")
    @Qualifier("address3qualifier")
    public Address address3() {
        var address = new Address("Street", "Paris");
        return address;
    }
}
