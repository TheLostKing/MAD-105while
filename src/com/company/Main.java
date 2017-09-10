package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        Scanner scan = new Scanner(System.in);
        String rpg = "";

        System.out.println("Please choose an rpg: \n1.Pathfinder\n2.D&D 5e\n3.Numenera\n4.Burning Wheel\n5.Stars Without Number");
        int selection = scan.nextInt();

        while (selection < 1 || selection > 5){
            System.out.print("Invalid selection. Please select a number 1 - 5: ");
            selection = scan.nextInt();
        }

        switch (selection){
            case 1: rpg = "Pathfinder";
                break;
            case 2: rpg = "D&D 5e";
                break;
            case 3: rpg = "Numenera";
                break;
            case 4: rpg = "Burning Wheel";
                break;
            case 5: rpg = "Stars Without Number";
                break;
        }
        System.out.print("You chose: " + rpg);
    }
}
