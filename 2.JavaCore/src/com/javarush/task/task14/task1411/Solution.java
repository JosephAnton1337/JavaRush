package com.javarush.task.task14.task1411;

import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
User, Loser, Coder and Proger
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Person person = null;
        String key = null;
        key = reader.readLine();
        boolean u = (key.equals("user") || key.equals("loser") || key.equals( "coder")|| key.equals("proger"));
        if(!u) {
            break;
        }
        switch (key) {
            case "user":
                person = new Person.User();
                break;
            case "loser":
                person = new Person.Loser();
                break;
            case "coder":
                person = new Person.Coder();
                break;
            case "proger":
                person = new Person.Proger();
                break;
        }
            doWork(person); //вызываем doWork


    }

    public static void doWork(Person person) {
        if (person instanceof Person.User){
            Person.User user =(Person.User) person;
        }
        if (person instanceof Person.Coder){
            Person.Coder coder = (Person.Coder)person;
        }
        if (person instanceof Person.Loser){
            Person.Loser loser = (Person.Loser)person;

        }
        if (person instanceof Person.Proger){
            Person.Proger proger = (Person.Proger) person;

        }

    }
}
