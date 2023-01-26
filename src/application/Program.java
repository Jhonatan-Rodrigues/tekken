package application;

import entities.match.Fight;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {

    List<String> list = new ArrayList<>();

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("----Let's Go, Start----");
        System.out.println("Choose the name of your arena");
        String local = sc.nextLine();
        System.out.println("Choose the duration of you battle");
        String time = sc.nextLine();
        Fight fight1 = new Fight(local, time);

        Fight.apresentFight();
        fight1.chooseYourFighter();

        System.out.println("\nThe most overral is the winner, What a power!!!");


    }


}



