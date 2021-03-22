package org.example;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws FileNotFoundException {
        Inventory inventory = new Inventory();

        Item goldCoin = new Item("Gold coin");
        Item dagger = new Item("Dagger");


//        inventory.add(goldCoin);
//        inventory.add(dagger);
//
//        String inventoryDisplay = inventory.toString();
//        System.out.println(inventoryDisplay);
//
//        inventory.remove(dagger);
//
//        System.out.println(inventory);
//
//        System.out.println(inventory.contains(goldCoin));
//
        System.out.print("Give me answer: ");


//        Scanner scanner = new Scanner(System.in);
//        String answer = scanner.next();
//        scanner.close();
//
//        int number = Integer.parseInt(answer);
//
//        System.out.println(number);


        FileHandler fileHandler = new FileHandler();
        ArrayList<Item> items = fileHandler.read("file not found ...");

        for (Item item : items) {
            inventory.add(item);
        }

//        System.out.println(inventory);

    }
}
