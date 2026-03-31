package us.mattgreen;

import java.util.ArrayList;
import java.util.Scanner;

public class UserPrompt {

    private final Scanner scanner = new Scanner(System.in);
    private final ArrayList<Talkable> createdAnimalList;

    public UserPrompt(ArrayList<Talkable> animalList) {
        this.createdAnimalList = animalList;
    }

    public void addAnimal() {
        System.out.println("What kind of animal would you like to add?");
        String newAnimal = scanner.nextLine().toLowerCase();

        if (newAnimal.equals("dog")) {
            System.out.println("What is the dog's name?");
            String name = scanner.nextLine();

            System.out.println("Are they friendly (true or false)?");
            boolean friendly = Boolean.parseBoolean(scanner.nextLine());

            Dog dog = new Dog(friendly, name);
            createdAnimalList.add(dog);

        } else if (newAnimal.equals("cat")) {
            System.out.println("What is the cat's name?");
            String name = scanner.nextLine();

            System.out.println("How many mice has this cat killed?");
            int miceKilled = Integer.parseInt(scanner.nextLine());

            Cat cat = new Cat(miceKilled, name);
            createdAnimalList.add(cat);

        } else {
            System.out.println("I don't know this animal!");
        }
    }
}