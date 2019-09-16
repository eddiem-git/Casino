package com.github.git_leon.casino;

import com.github.git_leon.casino.utils.Card;
import com.github.git_leon.casino.utils.Deck;
import com.github.git_leon.casino.utils.Rank;
import com.github.git_leon.casino.utils.Suit;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class MainApplication {
    public static void main(String[] args) {
        //Welcome message first
        Console console = new Console();
        console.println("Welcome to the Casino");
        String userInput = console.getStringInput("From here you [make account], [select account], [select game]");
        if(userInput == "make account") {
            Account account = makeAcount();
        }
    }

    private static Account makeAcount() {
        Console console = new Console();
        console.println("Welcome to the account creation screen");
        String userName = console.getStringInput("What is your name?");
        Double userMoney = console.getDoubleInput("How much money do you have?");
        Account account = new Account();
        account.setUserName(userName);
        account.setMoney(userMoney);
        return account;
    }

    public void shuffle(){
        ArrayList<Card> tempDeck = new ArrayList<Card>();
    }

    public static Person createPerson() {
        Console console = new Console();
        String name = console.getStringInput("What is your name?");
        Integer age = console.getIntegerInput("What is your age?");
        Person newUser = new Person(name, age);
        return newUser;
    }


}

