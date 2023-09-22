package org.example;

import org.example.beans.Duck;
import org.example.beans.DuckWithWings;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.beans.beancontext.BeanContext;
import java.util.ArrayList;
import java.util.LinkedList;

@SpringBootApplication
public class Main {



    public static void main(String[] args) {

        System.out.printf("Hello and welcome!");

        SpringApplication.run(Main.class,args);









    }
}