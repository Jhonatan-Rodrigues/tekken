package application;

import entities.characters.EddyGordon;
import entities.characters.Heihachi;
import entities.match.Fight;

import java.util.Scanner;

public class Program {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("----Let's Go, Start----");
        System.out.println("Choose the name of your arena");
        String local = sc.nextLine();
        System.out.println("Choose the duration of you battle");
        String time = sc.nextLine();
        Fight fight1 = new Fight(local, time);
        fight1.apresentFight();

        fight1.battle(new EddyGordon(), new Heihachi());






    }


}



