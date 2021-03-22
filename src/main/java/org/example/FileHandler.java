package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileHandler {

    public ArrayList<Item> read(String path) throws FileNotFoundException {
        File file = new File(path);
        ArrayList<String> lines = new ArrayList<>();
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            lines.add(scanner.nextLine());
        }
        scanner.close();

        ArrayList<Item> items = new ArrayList<>();
        for (String line : lines) {
            String[] names = line.trim().split(",");
            for (String name: names) {
                Item item = new Item(name);
                items.add(item);
            }
        }

        return items;
    }
}
