package com.pluralsight.myproject.practice;


import java.util.Arrays;
import java.util.Scanner;
public class Sum {
    private static int water = 400;
    private static int milk = 540;
    private static int coffeeBeans = 120;
    private static int cups = 9;
    private static int money = 550;

    public static void main(String[] args) {

        results();

        getString();

    }

    private static void getString() {
        System.out.println("Write action (buy, fill, take, remaining, exit):");
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
            while (true) {
                switch (text) {
                    case "buy":
                        buy();
                        break;
                    case "fill":
                        fill();
                        break;
                    case "remaining":
                        results();
                        break;
                    case "take":
                        take();
                        break;
                    case "exit":
                        System.exit(0);
                    default:
                        getString();
                }
            }
    }

    private static void results() {
        System.out.println("The coffee machine has: ");
        System.out.println( water +" of water.");
        System.out.println( milk + " of milk.");
        System.out.println( coffeeBeans + " of coffee beans.");
        System.out.println( cups + " of disposable cups.");
        System.out.println(money + " of money");

        getString();
    }

    private static void take() {

        System.out.println("I gave you " + money);
        money = 0;

        getString();
    }

    private static void fill() {

        System.out.println("Write how many ml of water do you want to add:");
        Scanner sc = new Scanner(System.in);
        int addedWater = sc.nextInt();
        water += addedWater;
        System.out.println("Write how many ml of milk do you want to add:");
        int addedMilk = sc.nextInt();
        milk = milk + addedMilk;
        System.out.println("Write how many grams of coffee beans do you want to add:");
        int addedGrams = sc.nextInt();
        coffeeBeans += addedGrams;
        System.out.println("Write how many disposable cups of coffee do you want to add:");
        int addedCups = sc.nextInt();
        cups += addedCups;

        getString();
    }

    private static void buy() {

        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();
        switch (num) {
            case "1": {
                boolean execute = water > 250 && coffeeBeans > 16 && cups > 0;
                if (execute) {
                    water = water - 250;
                    coffeeBeans = coffeeBeans - 16;
                    cups -= 1;
                    money += 4;
                    System.out.println("I have enough resources, making you a Coffee");
                } else {
                    if (water < 250 && coffeeBeans < 16 && cups < 1){
                        System.out.println("Sorry I don't have enough Water, Coffee Beans and Cups.");
                    } else if (coffeeBeans < 16){
                        System.out.println("Sorry I don't have enough Coffee Beans");
                    } else if (water < 250){
                        System.out.println("Sorry I don't have enough water");
                    } else {
                        System.out.println("Sorry we don't have enough cups");
                    }
                }
                getString();
                break;
            }
            case "2": {
                boolean execute = water > 350 && coffeeBeans > 20 && milk > 75 && cups > 0;
                if (execute) {
                    water = water - 350;
                    milk = milk - 75;
                    coffeeBeans = coffeeBeans - 20;
                    cups -= 1;
                    money += 7;
                    System.out.println("I have enough resources, making you a Coffee");
                } else {
                    if (water < 350 && coffeeBeans < 20 && cups < 1 && milk < 75){
                        System.out.println("Sorry I don't have enough Water, Milk, Coffee Beans and Cups.");
                    } else if (coffeeBeans < 20){
                        System.out.println("Sorry I don't have enough Coffee Beans.");
                    } else if (water < 350){
                        System.out.println("Sorry I don't have enough water.");
                    } else if (milk < 75){
                        System.out.println("Sorry I don't have enough milk.");
                    } else {
                        System.out.println("Sorry we don't have enough cups.");
                    }
                }
                getString();
                break;
            }
            case "back":
                getString();
                break;
            default: {
                boolean execute = water > 200 && coffeeBeans > 12 && milk > 100 && cups > 0;
                if (execute) {
                    water = water - 200;
                    milk = milk - 100;
                    coffeeBeans = coffeeBeans - 12;
                    cups -= 1;
                    money += 6;
                    System.out.println("I have enough resources, making you a Coffee");
                } else {
                    if (water < 200 && coffeeBeans < 12 && cups < 1 && milk < 100){
                        System.out.println("Sorry I don't have enough Water, Milk, Coffee Beans and Cups.");
                    } else if (coffeeBeans < 12){
                        System.out.println("Sorry I don't have enough Coffee Beans.");
                    } else if (water < 200){
                        System.out.println("Sorry I don't have enough water.");
                    } else if (milk < 100){
                        System.out.println("Sorry I don't have enough milk.");
                    } else {
                        System.out.println("Sorry we don't have enough cups.");
                    }
                }
                getString();
                break;
            }
        }
    }
}
