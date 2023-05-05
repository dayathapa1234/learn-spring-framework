package com.in28minutes.learnspringframework.test;

import java.io.Serializable;

// Plain Old Java Object
class Pogo {
    private String text;
    private int number;

    public String toString() {
        return text + ":" + number;
    }
}

// EJB - Enterprise Java Bean
// Constraint - Serializable
class JavaBean implements Serializable {

    // Constraint - public no-arg constructor
    public JavaBean(){

    }
    private String text;
    private int number;

    // Constraint - Getters and Setters
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}

// Any Java object managed by Spring is Spring Bean

public class SpringBeanVsJavaBean {

    public static void main(String[] args){
        Pogo pogo = new Pogo();
        System.out.println(pogo);
    }
}
