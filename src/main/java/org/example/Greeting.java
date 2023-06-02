package org.example;

import java.util.Scanner;

public class Greeting {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("What is your name?");
        System.out.println("Carlos");
        String name = "Carlos";
        System.out.println(greeting(name));
    }

    public static String greeting(String name){
        return "Hi " + name;
    }
}